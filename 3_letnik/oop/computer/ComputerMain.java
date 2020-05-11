package com.yourname.projectname.letnik_3.computer;

import com.yourname.projectname.letnik_3.computer.cpu.CPU;
import com.yourname.projectname.letnik_3.computer.cpu.CPUSeries;
import com.yourname.projectname.letnik_3.computer.disk.Disk;
import com.yourname.projectname.letnik_3.computer.disk.SSDDisk;

import java.awt.*;

public class ComputerMain {

    public static void main(String[] args) {
        Computer computer = new Computer(
                new Motherboard(
                        new CPU("cpu-model", 12, CPUSeries.I7),
                        new GPU("GTX1080TI"),
                        new RAM[] {new RAM("model-rama", 8000, 200)},
                        new Disk[] {new SSDDisk(200, 50, 200)}),
                new Chassis(Color.RED, 5, 5, 5, new Fan[] {}));
        System.out.println("CPU model: " + computer.getMotherboard().getCpu().getModel());
        System.out.println("Chassis fans amount: " + computer.getChassis().getFans().length);
    }
}
