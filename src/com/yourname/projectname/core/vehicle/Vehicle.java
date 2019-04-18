package com.yourname.projectname.core.vehicle;

public abstract class Vehicle {

    private String name;
    private String description;
    private double maxSpeed;
    private boolean canFly;

    public Vehicle(String name, String description, double maxSpeed, boolean canFly) {
        this.name = name;
        this.description = description;
        this.maxSpeed = maxSpeed;
        this.canFly = canFly;
    }

    public Vehicle(String name, String description, double maxSpeed) {
        this(name, description, maxSpeed, false);
    }

    public Vehicle(String name, double maxSpeed) {
        this(name, "No description given.", maxSpeed, false);
    }

    public abstract void move();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isCanFly() {
        return canFly;
    }
}
