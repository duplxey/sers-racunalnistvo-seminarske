package com.yourname.projectname.core.bike;

public class Bike {

    private String ime;
    private int hodMin, hodMax;

    public Bike(String ime, int hodMin, int hodMax) {
        this.ime = ime;
        this.hodMin = hodMin;
        this.hodMax = hodMax;
    }

    public String getIme() {
        return ime;
    }

    public int getHodMin() {
        return hodMin;
    }

    public int getHodMax() {
        return hodMax;
    }
}
