package com.yourname.projectname.core.shapes.threedimensional;

import com.yourname.projectname.core.shapes.Shape3D;

public class Cube extends Shape3D {

    private double a;

    public Cube(double a) {
        super("Cube", "6-sided cube.");

        this.a = a;
    }

    @Override
    public double getSurface() {
        return Math.pow(a, 2)*6;
    }

    @Override
    public double getVolume() {
        return Math.pow(a, 2)*a;
    }

    public double getDiagonal() {
        return a * 1.73;
    }

    public double getA() {
        return a;
    }
}
