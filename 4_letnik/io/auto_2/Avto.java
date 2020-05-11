package com.yourname.projectname.letnik_4.auto_2;

import java.io.*;

public class Avto {

    private String ime;
    private String opis;
    private String registerska;
    private int maxHitrost;
    private double poraba;
    private double prevozeniKm;

    public Avto(String ime, String opis, String registerska, int maxHitrost, double poraba, double prevozeniKm) {
        this.ime = ime;
        this.opis = opis;
        this.registerska = registerska;
        this.maxHitrost = maxHitrost;
        this.poraba = poraba;
        this.prevozeniKm = prevozeniKm;
    }

    public Avto(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            int i = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (i == 0) {
                    ime = line;
                } else if (i == 1) {
                    opis = line;
                } else if (i == 2) {
                    registerska = line;
                } else if (i == 3) {
                    maxHitrost = Integer.parseInt(line);
                } else if (i == 4) {
                    poraba = Double.parseDouble(line);
                } else if (i == 5) {
                    prevozeniKm = Double.parseDouble(line);
                }
                i++;
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void vozi() {
        System.out.println("Vroom!");
    }

    public void ustavi() {
        System.out.println("Ustavil sem se.");
    }

    public void potrobi() {
        System.out.println("Beep! beep!");
    }

    public void izpis() {
        System.out.println(ime);
        System.out.println("Opis: " + opis);
        System.out.println("Registerska: " + registerska);
        System.out.println("Maksimalna hitrost: " + maxHitrost + "km/h");
        System.out.println("Poraba: " + poraba + "l/100km");
        System.out.println("Prevoženi kilometri: " + prevozeniKm);
    }

    public void save(File file) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(ime);
            writer.newLine();
            writer.write(opis);
            writer.newLine();
            writer.write(registerska);
            writer.newLine();
            writer.write(maxHitrost + "");
            writer.newLine();
            writer.write(poraba + "");
            writer.newLine();
            writer.write(prevozeniKm + "");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getIme() {
        return ime;
    }

    public String getOpis() {
        return opis;
    }

    public String getRegisterska() {
        return registerska;
    }

    public int getMaxHitrost() {
        return maxHitrost;
    }

    public double getPoraba() {
        return poraba;
    }

    public double getPrevozeniKm() {
        return prevozeniKm;
    }

    @Override
    public String toString() {
        return ime + " (" + opis + ") " + maxHitrost + "km/h " + prevozeniKm + "km";
    }
}
