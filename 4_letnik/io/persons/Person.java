package com.yourname.projectname.letnik_4.persons;

import java.io.*;

public class Person {

    private File file;

    private String name;
    private String surname;
    private String description;

    public Person(File directory, String name, String surname, String description) {
        this.name = name;
        this.surname = surname;
        this.description = description;

        file = new File(directory, getID() + ".txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        setDescription(description);
    }

    public Person(File personFile) {
        load(personFile);
    }

    private void load(File file) {
        String[] split = file.getName().replace(".txt", "").split("_");
        this.name = split[0];
        this.surname = split[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                description = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void save() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(description);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        file.delete();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        save();
    }

    public String getID() {
        return getName() + "_" + getSurname();
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", description='" + description + '\'' + '}';
    }
}
