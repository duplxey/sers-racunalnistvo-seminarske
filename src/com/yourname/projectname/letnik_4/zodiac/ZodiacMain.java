package com.yourname.projectname.letnik_4.zodiac;

import java.util.Scanner;

public class ZodiacMain {

    public static void main(String[] args) {
        ZodiacManager zodiacManager = new ZodiacManager();
        ZodiacStatistics zodiacStatistics = new ZodiacStatistics();
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----*------ Zodiacs -----*------");
        System.out.println("Please enter the date of your birth (dd.mm): ");
        String line;
        while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
            Zodiac zodiac = zodiacManager.getZodiac(DateUtil.getDay(line));
            zodiac.prettyPrint();
            zodiacStatistics.increase(zodiac);
            System.out.println("This zodiac has been displayed " + zodiacStatistics.get(zodiac) + " times.");
            System.out.println("If you'd like to exit the program type 'exit' or you can type another date of birth.");
        }
    }
}
