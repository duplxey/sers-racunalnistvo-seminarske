package com.yourname.projectname.letnik_3.bike;

import java.util.HashSet;
import java.util.Scanner;

public class BikeMain {

    private static HashSet<Bike> bikes = new HashSet<>();

    public static void main(String[] args) {
        register();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesite hod kolesa: ");
        int i = scanner.nextInt();

        boolean out = false;
        for (Bike bike : bikes) {
            if (i >= bike.getHodMin() && i <= bike.getHodMax()) {
                System.out.println("Vaše kolo je: " + bike.getIme());
                out = true;
                break;
            }
        }
        if (!out) {
            System.out.println("To kolo ne obstaja!");
        }
    }

    private static void register() {
        bikes.add(new AMBike());
        bikes.add(new DHBike());
        bikes.add(new EnduroBike());
        bikes.add(new TrailBike());
        bikes.add(new XCBike());
    }
}
