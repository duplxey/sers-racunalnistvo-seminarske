package com.yourname.projectname.letnik_4.grades;

import java.util.HashMap;

public class SubjectManager {

    private HashMap<String, Subject> subjects = new HashMap<>();

    public SubjectManager() {
        subjects.put("math", new Subject("math", "Mathematics is the science that deals with the logic of shape, quantity and arrangement."));
        subjects.put("english", new Subject("english", "English is a language—originally the language of the people of England."));
        subjects.put("programming", new Subject("programming", "Programming is the art and science of translating a set of ideas into a program - a list of instructions a computer can follow. The person writing a program is known as a programmer."));
    }

    public Subject getSubject(String id) {
        return subjects.get(id);
    }

    public HashMap<String, Subject> getSubjects() {
        return subjects;
    }
}
