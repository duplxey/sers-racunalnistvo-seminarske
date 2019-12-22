package com.yourname.projectname.letnik_4.filmi_simplified;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Predvajalnik {

    private boolean running = true;
    private Film predvajaniFilm = null;
    private LinkedList<Film> filmi;

    public Predvajalnik() {
        Film film1 = new Film(
                "Donnie_Darko",
                "A troubled teenager is plagued by visions of a man in a large rabbit suit who manipulates him to commit a series of crimes, after he narrowly escapes a bizarre accident.",
                "Richard Kelly",
                113
        );
        Film film2 = new Film(
                "Avengers_Infinity_War",
                "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe.",
                "Anthony Russo",
                149
        );
        Film film3 = new Film(
                "Eternal_Sunshine_of_the_Spotless_Mind",
                "When their relationship turns sour, a couple undergoes a medical procedure to have each other erased from their memories.",
                "Michel Gondry",
                108
        );

        filmi = new LinkedList<>(Arrays.asList(
                film1, film2, film3
        ));

        zazeni();
    }

    private void zazeni() {
        System.out.println("--------------------------------------");
        System.out.println("    Predvajalnik je bil zagnan.");
        System.out.println("--------------------------------------");
        System.out.println("predvajani - Izpise trenutno predvajani film");
        System.out.println("predvajaj <indeks> - Predvaja film");
        System.out.println("shrani <indeks> - Shrani film v datoteko");
        System.out.println("nalozi <imeDatoteke> - Nalozi film iz datoteke in ga predvaja.");
        System.out.println("ugasni - Ugasne predvajalnik");
        System.out.println("--------------------------------------");
        for (Film film : filmi) {
            System.out.println("- " + film.getIme() + " (" + film.getDolzina() + "m)");
        }
        System.out.println("--------------------------------------");
        while (running) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine().toLowerCase();
            String[] split = line.split(" ");

            if (split[0].equalsIgnoreCase("predvajani")) {
                if (predvajaniFilm == null) {
                    System.out.println("Trenutno ne predvajam nicesar.");
                } else {
                    System.out.println("Trenutno predvajam " + predvajaniFilm.getIme() + ".");
                }
                continue;
            }

            if (split[0].equalsIgnoreCase("predvajaj")) {
                int i = Integer.parseInt(split[1]);
                if (i >= filmi.size()) {
                    System.out.println("Neprepoznan film. Prosim izberite stevilo med 0 in " + (filmi.size()-1) + ".");
                } else {
                    predvajaj(filmi.get(i));
                }
                continue;
            }

            if (split[0].equalsIgnoreCase("shrani")) {
                System.out.println("Film je bil uspešno shranjen.");
                shrani(Integer.parseInt(split[1]));
                continue;
            }

            if (split[0].equalsIgnoreCase("nalozi")) {
                Film film = nalozi(split[1]);
                predvajaj(film);
                continue;
            }

            if (split[0].equalsIgnoreCase("ugasni")) {
                ugasni();
                continue;
            }

            System.out.println("Neprepoznan ukaz.");
        }
    }

    public void predvajaj(Film film) {
        predvajaniFilm = film;
        System.out.println("Predvajam " + film.getIme() + ".");
        film.izpis();
    }

    public void ugasni() {
        System.out.println("Predvajalnik je bil ugasnjen.");
        running = false;
    }

    public Film nalozi(String imeDatoteke) {
        Film film = new Film(new File(imeDatoteke));
        filmi.add(film);
        return film;
    }

    public void shrani(int indeks) {
        filmi.get(indeks).save(new File(filmi.get(indeks).getIme() + ".txt"));
    }

    public Film getPredvajaniFilm() {
        return predvajaniFilm;
    }
}
