package com.yourname.projectname.letnik_3.stano;

public class Lokacija {

    private int x;
    private int y;

    public Lokacija(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Lokacija{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
