package com.yourname.projectname.letnik_4.filmi_simplified;

import java.io.*;

public class Film {

    private String ime;
    private String opis;
    private String direktor;
    private int dolzina;

    public Film(String ime, String opis, String direktor, int dolzina) {
        this.ime = ime;
        this.opis = opis;
        this.direktor = direktor;
        this.dolzina = dolzina;
    }

    public Film(File file) {
        try {
            BufferedReader r = new BufferedReader(new FileReader(file));
            int i = 0;
            String line;
            while ((line = r.readLine()) != null) {
                switch (i) {
                    case 0:
                        ime = line;
                        break;
                    case 1:
                        opis = line;
                        break;
                    case 2:
                        direktor = line;
                        break;
                    case 3:
                        dolzina = Integer.parseInt(line);
                        break;
                }
                i++;
            }
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(File file) {
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter(file));
            w.write(ime);
            w.newLine();
            w.write(opis);
            w.newLine();
            w.write(direktor);
            w.newLine();
            w.write(dolzina + "");
            w.newLine();
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void izpis() {
        System.out.println("--------------------------------------");
        System.out.println("Ime: " + ime);
        System.out.println("Opis: " + opis);
        System.out.println("Direktor: " + direktor);
        System.out.println("Dolzina: " + dolzina + "m");
        System.out.println("--------------------------------------");
    }

    public String getIme() {
        return ime;
    }

    public String getOpis() {
        return opis;
    }

    public String getDirektor() {
        return direktor;
    }

    public int getDolzina() {
        return dolzina;
    }

    @Override
    public String toString() {
        return "Film[" + ime + "," + opis + "," + direktor + "," + dolzina + "]";
    }
}
