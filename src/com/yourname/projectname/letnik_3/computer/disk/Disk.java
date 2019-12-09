package com.yourname.projectname.letnik_3.computer.disk;

public class Disk {

    private int capacity;
    private int taken;
    private int speed;

    public Disk(int capacity, int taken, int speed) {
        this.capacity = capacity;
        this.taken = taken;
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTaken() {
        return taken;
    }

    public int getFree() {
        return capacity - taken;
    }

    public int getSpeed() {
        return speed;
    }
}
