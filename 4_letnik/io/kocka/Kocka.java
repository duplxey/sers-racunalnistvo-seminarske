package com.yourname.projectname.letnik_4.kocka;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Kocka {

    private int min;
    private int max;

    private Random random;
    private File file;
    private int[] meti;

    public Kocka(int min, int max) {
        this.min = min;
        this.max = max;

        random = new Random();
        meti = new int[max-min+1];

        // Ustvari nov file imenovan meti.txt, v primeru, da se ne obstaja.
        file = new File("meti.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        nalozi();
    }

    private void nalozi() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            if (line == null) {
                Arrays.fill(meti, 0);
            } else {
                String[] numbers = line.split(" ");
                for (int i = 0; i < numbers.length; i++) {
                    meti[i] = Integer.parseInt(numbers[i]);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void shrani() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            StringBuilder builder = new StringBuilder();
            for (int met : meti) {
                builder.append(met).append(" ");
            }
            writer.write(builder.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void vrzi() {
        int met = random.nextInt(max-min+1) + min;
        System.out.println("Vrgel " + met);
        meti[met-1]++;

        shrani();
    }

    public void izpis() {
        System.out.println("---------- Kocka izpis ----------");
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Meti: " + Arrays.toString(meti));
        System.out.println("---------------------------------");
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int[] getMeti() {
        return meti;
    }

    @Override
    public String toString() {
        return "Kocka{min=" + min + ", max=" + max + "}";
    }
}
