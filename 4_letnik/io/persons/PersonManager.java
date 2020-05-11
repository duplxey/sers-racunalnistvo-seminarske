package com.yourname.projectname.letnik_4.persons;

import java.io.File;
import java.util.Collection;
import java.util.LinkedHashMap;

public class PersonManager {

    private File directory;
    private LinkedHashMap<String, Person> peopleMap = new LinkedHashMap<>();

    public PersonManager() {
        directory = new File("people");
        if (!directory.exists()) {
            directory.mkdir();
        }
        for (File file : directory.listFiles()) {
            addPerson(new Person(file));
        }
    }

    public void addPerson(Person person) {
        peopleMap.put(person.getID(), person);
    }

    public void removePerson(String id) {
        peopleMap.get(id).delete();
        peopleMap.remove(id);
    }

    public Person getPerson(String id) {
        return peopleMap.get(id);
    }

    public String toID(String name, String surname) {
        return name + "_" + surname;
    }

    public Collection<Person> getPersons() {
        return peopleMap.values();
    }

    public File getDirectory() {
        return directory;
    }
}
