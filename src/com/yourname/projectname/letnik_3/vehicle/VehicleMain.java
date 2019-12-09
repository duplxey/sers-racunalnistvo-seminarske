package com.yourname.projectname.letnik_3.vehicle;

import com.yourname.projectname.letnik_3.vehicle.airplane.BowerFlyBaby;

public class VehicleMain {

    public static void main(String[] args) {
        // ustvarim Bower Fly Baby
        BowerFlyBaby bfb = new BowerFlyBaby();
        // program bo izpisal ime, opis, doseg, maksimalno hitrost, hitrost potovanja in ustavljanja
        System.out.println(bfb.getName());
        System.out.println("Opis: " + bfb.getDescription());
        System.out.println("Doseg: " + bfb.getRange());
        System.out.println("Maksimalna hitrost: " + bfb.getMaxSpeed());
        System.out.println("Hitrost potovanja: " + bfb.getCruiseSpeed());
        System.out.println("Hitrost ustavljanja: " + bfb.getStallSpeed());
        System.out.println("Lahko leti: " + bfb.isCanFly());
    }
}
