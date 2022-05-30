package de.hrw.progra2.assignment7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Horoscope {

    public static Map<Person, StarSign> mapPersonToStarSign(List<Person> persons){

        Map<Person, StarSign> map = new TreeMap<>();
        int day;
        int month;

        for (Person person : persons) {

            day = person.getBirthdate().getDay();
            month = person.getBirthdate().getMonth();

            if (month == 12 && day >= 22 || month == 1 && day <= 20) {
                map.put(person, new StarSign("Capricornus"));
            }
            if (month == 1 && day >= 21 || month == 2 && day <= 19) {
                map.put(person, new StarSign("Aquarius"));
            }
            if (month == 2 && day >= 20 || month == 3 && day <= 20) {
                map.put(person, new StarSign("Pisces"));
            }
            if (month == 3 && day >= 21 || month == 4 && day <= 20) {
                map.put(person, new StarSign("Aries"));
            }
            if (month == 4 && day >= 21 || month == 5 && day <= 20) {
                map.put(person, new StarSign("Taurus"));
            }
            if (month == 5 && day >= 21 || month == 6 && day <= 21) {
                map.put(person, new StarSign("Gemini"));
            }
            if (month == 6 && day >= 22 || month == 7 && day <= 22) {
                map.put(person, new StarSign("Cancer"));
            }
            if (month == 7 && day >= 23 || month == 8 && day <= 23) {
                map.put(person, new StarSign("Leo"));
            }
            if (month == 8 && day >= 24 || month == 9 && day <= 23) {
                map.put(person, new StarSign("Virgo"));
            }
            if (month == 9 && day >= 24 || month == 10 && day <= 23) {
                map.put(person, new StarSign("Libra"));
            }
            if (month == 10 && day >= 24 || month == 11 && day <= 22) {
                map.put(person, new StarSign("Scorpius"));
            }
            if (month == 11 && day >= 23 || month == 12 && day <= 21) {
                map.put(person, new StarSign("Sagittarius"));
            }

        }

        return map;
    }

}
