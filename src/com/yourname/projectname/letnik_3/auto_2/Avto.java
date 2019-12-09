package com.yourname.projectname.letnik_3.auto_2;

public class Avto extends Vozilo {

    private double poraba;
    private double prevozeniKm;

    public Avto(int maxHitrost, int starost, String opisVozila, String ime, double poraba, double prevozeniKm) {
        super(maxHitrost, starost, opisVozila, ime);
        this.poraba = poraba;
        this.prevozeniKm = prevozeniKm;
    }

    public void voznja() {
        System.out.println("Vroom!");
    }

    public double getPoraba() {
        return poraba;
    }

    public double getPrevozeniKm() {
        return prevozeniKm;
    }
}
