package com.yourname.projectname.core.prison.cell;

import com.yourname.projectname.core.prison.person.Offender;

import java.util.ArrayList;

public class Cell {

    private double length;
    private double width;
    private int maxOffenders;
    private ArrayList<Offender> offenders = new ArrayList<>();

    public Cell(double length, double width, int maxOffenders) {
        this.length = length;
        this.width = width;
        this.maxOffenders = maxOffenders;
    }

    public boolean addOffender(Offender offender) {
        if (offenders.size() >= maxOffenders) {
            return false;
        }
        offenders.add(offender);
        return true;
    }

    public void removeOffender(Offender offender) {
        offenders.remove(offender);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public ArrayList<Offender> getOffenders() {
        return offenders;
    }
}
