package com.yourname.projectname.core.prison.person;

public abstract class Person {

    private String name;
    private String surname;
    private boolean isWarden;

    public Person(String name, String surname, boolean isWarden) {
        this.name = name;
        this.surname = surname;
        this.isWarden = isWarden;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isWarden() {
        return isWarden;
    }
}
