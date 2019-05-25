package com.yourname.projectname.core.another;

public class Vozilo {

    private int maxHitrost;
    private int starost;
    private String opisVozila;
    private String ime;

    public Vozilo(int maxHitrost, int starost, String opisVozila, String ime) {
        this.maxHitrost = maxHitrost;
        this.starost = starost;
        this.opisVozila = opisVozila;
        this.ime = ime;
    }

    public int getMaxHitrost() {
        return maxHitrost;
    }

    public void setMaxHitrost(int maxHitrost) {
        this.maxHitrost = maxHitrost;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public String getOpisVozila() {
        return opisVozila;
    }

    public void setOpisVozila(String opisVozila) {
        this.opisVozila = opisVozila;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
}
