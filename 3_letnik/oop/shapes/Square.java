package com.yourname.projectname.letnik_3.shapes;

public class Square extends Shape2D {

    private double a;

    public Square(double a) {
        super("Square", "Square's description.");

        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.pow(a, 2);
    }

    public double getDiagonal() {
        return Math.sqrt(2) * a;
    }
}
