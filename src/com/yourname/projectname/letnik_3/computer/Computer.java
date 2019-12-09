package com.yourname.projectname.letnik_3.computer;

public class Computer {

    private Motherboard motherboard;
    private Chassis chassis;

    public Computer(Motherboard motherboard, Chassis chassis) {
        this.motherboard = motherboard;
        this.chassis = chassis;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }
}
