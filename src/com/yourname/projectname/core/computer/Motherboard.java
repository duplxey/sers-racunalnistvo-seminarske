package com.yourname.projectname.core.computer;

import com.yourname.projectname.core.computer.cpu.CPU;
import com.yourname.projectname.core.computer.disk.Disk;

public class Motherboard {

    private CPU cpu;
    private GPU gpu;
    private RAM[] ram;
    private Disk[] disks;

    public Motherboard(CPU cpu, GPU gpu, RAM[] ram, Disk[] disks) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.disks = disks;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public RAM[] getRam() {
        return ram;
    }

    public void setRam(RAM[] ram) {
        this.ram = ram;
    }

    public Disk[] getDisks() {
        return disks;
    }

    public void setDisks(Disk[] disks) {
        this.disks = disks;
    }
}
