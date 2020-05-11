package com.yourname.projectname.letnik_4.weatherstation;

public class WeatherMain {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation("DAVORIN");
        System.out.println("Loading captures from memory...");
        for (DayData capture : weatherStation.getCaptures()) {
            System.out.println("- " + capture);
        }
        System.out.println("Taking 3 captures and saving them.");
        weatherStation.capture();
        weatherStation.capture();
        weatherStation.capture();
    }
}
