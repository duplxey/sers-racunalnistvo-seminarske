package com.yourname.projectname.letnik_3.auto;

public class Avtomobil {

    private String model;
    private String tipMotorja;
    private double pospesekDo100;
    private double mocMotorja;
    private double cena;

    public Avtomobil(String model, String tipMotorja, double pospesekDo100, double mocMotorja, double cena) {
        this.model = model;
        this.tipMotorja = tipMotorja;
        this.pospesekDo100 = pospesekDo100;
        this.mocMotorja = mocMotorja;
        this.cena = cena;
    }

    public void izpis() {
        System.out.println("---" + model + "---");
        System.out.println("Tip motorja: " + tipMotorja);
        System.out.println("Pospesek od 0-100km/h: " + pospesekDo100);
        System.out.println("Moc motorja: " + mocMotorja);
        System.out.println("Cena: " + cena + "$");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTipMotorja() {
        return tipMotorja;
    }

    public void setTipMotorja(String tipMotorja) {
        this.tipMotorja = tipMotorja;
    }

    public double getPospesekDo100() {
        return pospesekDo100;
    }

    public void setPospesekDo100(double pospesekDo100) {
        this.pospesekDo100 = pospesekDo100;
    }

    public double getMocMotorja() {
        return mocMotorja;
    }

    public void setMocMotorja(double mocMotorja) {
        this.mocMotorja = mocMotorja;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
