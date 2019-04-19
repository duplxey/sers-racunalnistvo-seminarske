package com.yourname.projectname.core.prison.person;

public class Offender extends Person {

    private CrimeType crimeType;

    public Offender(String name, String surname, CrimeType crimeType) {
        super(name, surname, false);

        this.crimeType = crimeType;
    }

    public void escape() {
        System.out.println(getName() + " just escaped!");
    }

    public CrimeType getCrimeType() {
        return crimeType;
    }
}
