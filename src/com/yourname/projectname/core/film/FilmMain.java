package com.yourname.projectname.core.film;

public class FilmMain {

    public static void main(String[] args) {
        Film film = new Film("Donnie Darko", "About a funny little bunny.", FilmZanr.ZNANSTVENA_FANTASTIKA, 120, false);
        System.out.println("Opis filma:");
        System.out.println("Naslov: " + film.getNaslov());
        System.out.println("Opis: " + film.getOpis());
        System.out.println("-----------");
        System.out.println("Zanr: " + film.getZanr());
        System.out.println("Trajanje: " + film.getTrajanje());
        System.out.println("-----------");
        film.oglej();
    }
}
