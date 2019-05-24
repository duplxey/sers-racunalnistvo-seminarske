package com.yourname.projectname.core.computer;

public class Fan {

    private double diameter;
    private int speed;

    private boolean spinning = false;

    public Fan(double diameter, int speed) {
        this.diameter = diameter;
        this.speed = speed;
    }

    public boolean startSpinning() {
        if (spinning) {
            System.out.println("Fan is already spinning!");
            return false;
        }
        System.out.println("Started spinning...");
        spinning = true;
        return true;
    }

    public boolean stopSpinning() {
        if (!spinning) {
            System.out.println("Fan is not spinning!");
            return false;
        }
        System.out.println("Stopped spinning.");
        spinning = false;
        return true;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getSpeed() {
        return speed;
    }
}
