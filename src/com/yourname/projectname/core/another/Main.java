package com.yourname.projectname.core.another;

public class Main {

    public static void main(String[] args) {
        Ferrari485 ferrari485 = new Ferrari485();
        System.out.println(ferrari485.getIme());
        System.out.println("Opis: " + ferrari485.getOpisVozila());
        System.out.println("Starost: " + ferrari485.getStarost() + "let");
        System.out.println("Maksimalna hitrost: " + ferrari485.getMaxHitrost() + "km/h");
        System.out.println("Poraba: " + ferrari485.getPoraba() + "l/100km");
        System.out.println("Prevoženi kilometri: " + ferrari485.getPrevozeniKm());
    }
}
