package com.yourname.projectname.letnik_4.grades;

import java.io.*;
import java.util.ArrayList;

public class Subject {

    private String name;
    private String description;

    private File file;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Subject(String name, String description) {
        this.name = name;
        this.description = description;

        init();
        load();
    }

    private void init() {
        file = new File(name + ".txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void load() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                grades.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(int grade) {
        grades.add(grade);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            if (file.length() != 0) {
                bufferedWriter.newLine();
            }
            bufferedWriter.write(grade + "");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i : grades) {
            sum += i;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return name + "(" + description + ")";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
