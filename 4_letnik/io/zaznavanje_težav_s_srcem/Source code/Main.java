import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Ustvarimo osebo
        Person p1 = new Person("Blaz Psenicnik", 18, 108, 62, 41,
                85.3f, 1.86f);

        // Shranimo podatke
        Person.save("blaz", p1);

        // Shranimo izvid
        Person.saveReadable("Izvid", p1);

        // Ponovno naložimo osebo
        Person p2 = Person.load("blaz");

        // Spremenimo podatke
        p2.setSystolic(107);
        p2.setDiastolic(65);
        p2.setHeartRate(42);
        p2.setWeight(84.4f);

        // Shranimo izvid 2
        Person.saveReadable("Izvid 2", p2);

        // Izpišemo osebo na ekran
        System.out.println(p2);
    }
}
