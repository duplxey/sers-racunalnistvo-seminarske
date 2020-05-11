package com.yourname.projectname.letnik_4.zodiac;

import java.io.*;

public class ZodiacStatistics {

    private File statsFile;
    private int[] data = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public ZodiacStatistics() {
        statsFile = new File("stats.txt");
        if (!statsFile.exists()) {
            try {
                if (statsFile.createNewFile()) {
                    System.out.println("Successfully created stats.txt.");
                }
            } catch (IOException e) {
                System.out.println("Failed to create stats.txt.");
                e.printStackTrace();
            }
        }
        loadData();
    }

    private void loadData() {
        if (statsFile.length() == 0) return;
        try (BufferedReader reader = new BufferedReader(new FileReader(statsFile))) {
            String cfgData = reader.readLine();
            String[] split = cfgData.split(" ");
            for (int i = 0; i < split.length; i++) {
                data[i] = Integer.parseInt(split[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(statsFile))) {
            StringBuilder builder = new StringBuilder();
            for (int d : data) {
                builder.append(d).append(" ");
            }
            writer.write(builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void increase(Zodiac zodiac) {
        data[zodiac.getIndex()]++;
        saveData();
    }

    public int get(Zodiac zodiac) {
        return data[zodiac.getIndex()];
    }
}
