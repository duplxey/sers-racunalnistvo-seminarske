package com.yourname.projectname.letnik_4.auto_2;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Ferrari485 ferrari1 = new Ferrari485();
        ferrari1.izpis();

        File file = new File("avto.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Shranimo Ferrari485 v avto.txt
        ferrari1.save(file);

        System.out.println("--------------------------------");

        // Za demonstracijo bom isti avto naložil preko konstruktorja, ki vsebuje samo dato.
        Ferrari485 ferrari2 = new Ferrari485(file);
        ferrari2.izpis();
    }
}
