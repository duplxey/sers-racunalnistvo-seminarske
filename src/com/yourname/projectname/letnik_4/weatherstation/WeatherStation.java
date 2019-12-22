package com.yourname.projectname.letnik_4.weatherstation;

import java.io.*;
import java.util.LinkedList;
import java.util.Random;

public class WeatherStation {

    private String name;

    private File dataFile;
    private LinkedList<DayData> captures = new LinkedList<>();

    public WeatherStation(String name) {
        this.name = name;

        init();
        load();
    }

    private void init() {
        System.out.println("-- INITIALIZED " + name + " STATION --");
        dataFile = new File("data.txt");
        if (dataFile.exists()) {
        } else {
            try {
                dataFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void load() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(dataFile));
            String line;
            while ((line = reader.readLine()) != null) {
                captures.add(new DayData(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void save(DayData dayData) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(dataFile, true));
            writer.append(captures.size() + " " + dayData.getWeather() + " " + dayData.getTemperature() + " " + dayData.getHumidity());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void capture() {
        Random random = new Random();
        String weather = random.nextBoolean() ? "sunny" : "rainy";
        int temperature = random.nextInt(30) - 5;
        int humidity = random.nextInt(100) + 1;

        DayData dayData = new DayData(captures.size(), weather, temperature, humidity);
        captures.add(dayData);
        save(dayData);
    }

    public DayData getCapture(int dayIndex) {
        return captures.get(dayIndex);
    }

    public String getName() {
        return name;
    }

    public LinkedList<DayData> getCaptures() {
        return captures;
    }
}
