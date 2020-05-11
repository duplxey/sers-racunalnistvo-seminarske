package com.yourname.projectname.letnik_4.zodiac;

public class DateUtil {

    private static int[] daysInMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getDay(String date) throws NumberFormatException {
        String[] split = date.split("\\.");
        int day = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int out = 0;
        for (int i = 0; i < month-1; i++) {
            out += daysInMonth[i];
        }
        return out + day;
    }
}
