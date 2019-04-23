package com.yourname.projectname.core.shapes.twodimensional;

import com.yourname.projectname.core.shapes.Shape2D;

public class Circle extends Shape2D {

    private double r;

    public Circle(double r) {
        super("Circle", "Circle of trust");

        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(r, 2);
    }

    public double getDiagonal() {
        return 2*r;
    }

    public double getR() {
        return r;
    }
}
