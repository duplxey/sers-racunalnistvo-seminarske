package com.yourname.projectname.letnik_4.zodiac;

import java.util.Arrays;

public class Zodiac {

    private int index;
    private String name;
    private String description;
    private int[] dayRange;

    public Zodiac(int index, String name, String description, int[] dayRange) {
        this.index = index;
        this.name = name;
        this.description = description;
        this.dayRange = dayRange;
    }

    public boolean matches(int day) {
        return day >= dayRange[0] && day <= dayRange[1];
    }

    public void prettyPrint() {
        System.out.println("-----*------ Zodiac > Information ------*-----");
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Date range: " + Arrays.toString(dayRange));
        System.out.println("-----*----------------------------------*-----");
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int[] getDayRange() {
        return dayRange;
    }

    @Override
    public String toString() {
        return name + " (" + description  + ") [" + Arrays.toString(dayRange) + "]";
    }
}
