package com.yourname.projectname.letnik_3.vehicle.airplane;

import com.yourname.projectname.letnik_3.vehicle.Vehicle;

public class Airplane extends Vehicle {

    private double cruiseSpeed;
    private double stallSpeed;
    private double range;

    public Airplane(String name, String description, double maxSpeed, double cruiseSpeed, double stallSpeed, double range) {
        super(name, description, maxSpeed, true);
        this.cruiseSpeed = cruiseSpeed;
        this.stallSpeed = stallSpeed;
        this.range = range;
    }

    @Override
    public void move() {
        System.out.println("Fjeeeeew!");
    }

    public double getCruiseSpeed() {
        return cruiseSpeed;
    }

    public double getStallSpeed() {
        return stallSpeed;
    }

    public double getRange() {
        return range;
    }
}
