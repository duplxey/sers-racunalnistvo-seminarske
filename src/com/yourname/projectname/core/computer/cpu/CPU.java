package com.yourname.projectname.core.computer.cpu;

public class CPU {

    private String model;
    private int speed;
    private CPUSeries series;

    public CPU(String model, int speed, CPUSeries series) {
        this.model = model;
        this.speed = speed;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public CPUSeries getSeries() {
        return series;
    }
}
