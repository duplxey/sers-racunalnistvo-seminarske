package com.yourname.projectname.letnik_4.weatherstation;

public class DayData {

    private int index;
    private String weather;
    private int temperature;
    private int humidity;

    public DayData(int index, String weather, int temperature, int humidity) {
        this.index = index;
        this.weather = weather;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public DayData(String data) {
        String[] lineData = data.split(" ");
        this.index = Integer.parseInt(lineData[0]);
        this.weather = lineData[1];
        this.temperature = Integer.parseInt(lineData[2]);
        this.humidity = Integer.parseInt(lineData[3]);
    }

    public int getIndex() {
        return index;
    }

    public String getWeather() {
        return weather;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        return index + ": " + weather + ",temp:" + temperature + "celsius,humidity:" + humidity + "%";
    }
}
