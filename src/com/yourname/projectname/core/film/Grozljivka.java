package com.yourname.projectname.core.film;

public class Grozljivka extends Film {

    public Grozljivka(String naslov, String opis, double trajanje) {
        super(naslov, opis, FilmZanr.GROZLJIVKA, trajanje, false);
    }
}
