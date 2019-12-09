package com.yourname.projectname.letnik_3.stano;

public class StanovanjaMain {

    public static void main(String[] args) {
        // Ustvarimo novo lokacijo
        Lokacija lokacija = new Lokacija(5, 5);

        // Na to lokacijo postavimo zgradbo
        Zgradba zgradba = new Zgradba(lokacija);

        // Naredimo novo garsonjero
        Garsonjera garsonjera = new Garsonjera();
        System.out.println("--- Garsonjera ---");
        System.out.println("Velikost x: " + garsonjera.getVelikostX());
        System.out.println("Velikost y: " + garsonjera.getVelikostY());
        System.out.println("Povrsina: " + garsonjera.getPovrsina());
        System.out.println("Vrednost: " + garsonjera.getVrednost());
        System.out.println("Opremljenost: " + garsonjera.getOpremljenost());
        System.out.println("Okolica: " + garsonjera.getOkolica());

        // Dodamo garsonjero v zgradbo
        zgradba.addStanovanje(garsonjera);
    }
}
