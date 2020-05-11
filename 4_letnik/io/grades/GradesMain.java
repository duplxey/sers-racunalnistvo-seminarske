package com.yourname.projectname.letnik_4.grades;

import java.util.Scanner;

public class GradesMain {

    public static void main(String[] args) {
        SubjectManager subjectManager = new SubjectManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- Grades | Simple grade management --------");
        System.out.println("You can use the following commands:");
        System.out.println("list <subject> - displays your grades");
        System.out.println("average <subject> - calculates your average grade");
        System.out.println("add <subject> <grade> - adds a grade");
        System.out.println("--------------------------------------------------");

        while (true) {
            String line = scanner.nextLine().toLowerCase();
            String[] split = line.split(" ");
            String command = split[0];
            Subject subject = subjectManager.getSubject(split[1]);

            switch (command) {
                case "add":
                    if (subject == null) {
                        System.out.println("Specified subject doesn't exist!");
                        break;
                    }
                    try {
                        int grade = Integer.parseInt(split[2]);
                        if (grade < 1 || grade > 5) {
                            System.out.println("Grade needs to be between 1 and 5.");
                            break;
                        }
                        subject.add(grade);
                        System.out.println("You've added a grade (" + grade + ") to " + subject.getName() + ".");
                    } catch (NumberFormatException e) {
                        System.out.println("Grade needs to be between 1 and 5.");
                    }
                    break;
                case "list":
                    if (subject == null) {
                        System.out.println("Specified subject doesn't exist!");
                        break;
                    }
                    if (subject.getGrades().size() == 0) {
                        System.out.println("You currently do not have any grades.");
                    } else {
                        System.out.println("Your current grades at " + subject.getName() + ":");
                        for (int grade : subject.getGrades()) {
                            System.out.println("- " + grade);
                        }
                    }
                    break;
                case "average":
                    if (subject == null) {
                        System.out.println("Specified subject doesn't exist!");
                        break;
                    }
                    System.out.println("Your average grade at " + subject.getName() + " is " + subject.getAverageGrade());
                    break;
                case "exit":
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong syntax!");
                    break;
            }
        }
    }
}
