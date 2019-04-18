package com.yourname.projectname.core.computer;

public class Fan {

    private double diameter;
    private int speed;

    public Fan(double diameter, int speed) {
        this.diameter = diameter;
        this.speed = speed;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getSpeed() {
        return speed;
    }
}
