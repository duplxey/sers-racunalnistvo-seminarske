package com.yourname.projectname.letnik_3.stano;

import java.util.ArrayList;

public class Zgradba {

    private Lokacija lokacija;
    private ArrayList<Stanovanje> stanovanja = new ArrayList<>();

    public Zgradba(Lokacija lokacija) {
        this.lokacija = lokacija;
    }

    public void addStanovanje(Stanovanje stanovanje) {
        stanovanja.add(stanovanje);
    }

    public Lokacija getLokacija() {
        return lokacija;
    }
}
