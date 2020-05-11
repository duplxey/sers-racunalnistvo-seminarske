package com.yourname.projectname.letnik_4.zodiac;

import com.yourname.projectname.letnik_4.zodiac.zodiacs.*;

import java.util.Arrays;
import java.util.LinkedList;

public class ZodiacManager {

    private static LinkedList<Zodiac> zodiacs = new LinkedList<>();

    public ZodiacManager() {
        load();
    }

    private void load() {
        zodiacs = new LinkedList<>(Arrays.asList(
                new AquariusZodiac(),
                new AriesZodiac(),
                new CancerZodiac(),
                new CapricornZodiac(),
                new GeminiZodiac(),
                new LeoZodiac(),
                new LibraZodiac(),
                new PiscesZodiac(),
                new SagittariusZodiac(),
                new ScorpioZodiac(),
                new TaurusZodiac(),
                new VirgoZodiac()
        ));
    }

    public Zodiac getZodiac(int day) {
        for (Zodiac zodiac : zodiacs) {
            if (zodiac.matches(day)) {
                return zodiac;
            }
        }
        return zodiacs.get(0);
    }

    public static LinkedList<Zodiac> getZodiacs() {
        return zodiacs;
    }
}
