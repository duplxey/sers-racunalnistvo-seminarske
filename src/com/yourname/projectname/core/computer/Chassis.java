package com.yourname.projectname.core.computer;

import java.awt.*;

public class Chassis {

    private Color color;
    private int a, b, c;
    private Fan[] fans;

    public Chassis(Color color, int a, int b, int c, Fan[] fans) {
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
        this.fans = fans;
    }

    public Chassis(int a, int b, int c, Fan[] fans) {
        this(Color.BLACK, a, b, c, fans);
    }

    public Chassis(int a, int b, int c) {
        this(Color.BLACK, a, b, c, new Fan[] {});
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Fan[] getFans() {
        return fans;
    }

    public void setFans(Fan[] fans) {
        this.fans = fans;
    }
}
