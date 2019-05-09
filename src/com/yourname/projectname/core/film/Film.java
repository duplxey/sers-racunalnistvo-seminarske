package com.yourname.projectname.core.film;

public class Film {

    private String naslov;
    private String opis;
    private FilmZanr zanr;
    private double trajanje;
    private boolean primerenZaOtroke;

    public Film(String naslov, String opis, FilmZanr zanr, double trajanje, boolean primerenZaOtroke) {
        this.naslov = naslov;
        this.opis = opis;
        this.zanr = zanr;
        this.trajanje = trajanje;
        this.primerenZaOtroke = primerenZaOtroke;
    }

    public Film(String naslov, String opis, FilmZanr zanr, double trajanje) {
        this(naslov, opis, zanr, trajanje, true);
    }

    public Film(String naslov, String opis, double trajanje) {
        this(naslov, opis, FilmZanr.DRAMA, trajanje, true);
    }

    public void oglej() {
        System.out.println("Gledam film " + toString() + ".");
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public FilmZanr getZanr() {
        return zanr;
    }

    public void setZanr(FilmZanr zanr) {
        this.zanr = zanr;
    }

    public double getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(double trajanje) {
        this.trajanje = trajanje;
    }

    public boolean isPrimerenZaOtroke() {
        return primerenZaOtroke;
    }

    public void setPrimerenZaOtroke(boolean primerenZaOtroke) {
        this.primerenZaOtroke = primerenZaOtroke;
    }

    @Override
    public String toString() {
        return naslov + " (" + opis + ") - " + zanr.toString();
    }
}
