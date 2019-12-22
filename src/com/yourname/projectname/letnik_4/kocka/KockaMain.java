package com.yourname.projectname.letnik_4.kocka;

import java.util.Scanner;

public class KockaMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kocka kocka = new Kocka(1, 6);

        System.out.println("----------- Kocka v1.0 ----------");
        System.out.println("Koliko metov želite izvesti?");
        int stMetov = scanner.nextInt();
        System.out.println("Kocka bo bila vržena " + stMetov + " krat.");
        System.out.println("---------------------------------");

        for (int i = 0; i < stMetov; i++) {
            kocka.vrzi();
        }
        kocka.izpis();
    }
}
