package com.yourname.projectname.letnik_4.persons;

import java.util.Arrays;
import java.util.Scanner;

public class PersonMain {

    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Persons v1.0");
        System.out.println("Uporabite lahko naslednje ukaze:");
        System.out.println("- add <ime> <priimek> <opis>");
        System.out.println("- remove <ime> <priimek>");
        System.out.println("- list");
        System.out.println("- end");

        boolean running = true;

        while (running) {
            String[] split = scanner.nextLine().split(" ");
            String command = split[0];
            String[] arguments = Arrays.copyOfRange(split, 1, split.length);

            switch (command) {
                case "add":
                    if (arguments.length < 3) {
                        System.out.println("Napačna uporaba ukaza!");
                        break;
                    }
                    StringBuilder builder = new StringBuilder();
                    for (int i = 2; i < arguments.length; i++) {
                        builder.append(arguments[i]).append(" ");
                    }
                    String description = builder.toString();
                    personManager.addPerson(new Person(personManager.getDirectory(), arguments[0], arguments[1], description));
                    System.out.println("Uspesno ste dodali novega uporabnika.");
                    break;
                case "remove":
                    if (arguments.length != 2) {
                        System.out.println("Napačna uporaba ukaza!");
                        break;
                    }
                    personManager.removePerson(personManager.toID(arguments[0], arguments[1]));
                    System.out.println("Uspesno ste odstranili novega uporabnika.");
                    break;
                case "list":
                    if (personManager.getPersons().size() == 0) {
                        System.out.println("Trenutno ni dodanih nobenih uporabnikov.");
                        break;
                    }
                    for (Person person : personManager.getPersons()) {
                        System.out.println(person);
                    }
                    break;
                case "end":
                    running = false;
                    System.out.println("Program je bil zaustavljen.");
                    break;
                default:
                    System.out.println("Ukaz ni bil prepoznan.");
                    break;
            }
        }
    }
}
