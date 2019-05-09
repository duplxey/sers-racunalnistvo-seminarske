package com.yourname.projectname.core.film;

public class FilmMain {

    public static void main(String[] args) {
        Film film = new Film("Donnie Darko", "About a funny little bunny.", FilmZanr.ZNANSTVENA_FANTASTIKA, 120, false);
        System.out.println("Trajanje: " + film.getTrajanje());
        film.oglej();
    }
}
