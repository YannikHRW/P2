package de.hrw.progra2.assignment9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Videogame {

    private String name;
    private List<String> developerStudios;
    private String pubDate;

    public Videogame(String name, List<String> developerStudios, String pubDate) {
        this.name = name;
        this.developerStudios = developerStudios;
        this.pubDate = pubDate;
    }

    public class PubDate {

        private int day;
        private String month;
        private int year;


        public PubDate(int day, int month, int year) {

            this.day = day;
            this.month = convertToString(month);
            this.year = year - 2000;

        }

        private String convertToString(int month) {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "Jan");
            map.put(2, "Feb");
            map.put(3, "Mar");
            map.put(4, "Apr");
            map.put(5, "May");
            map.put(6, "Jun");
            map.put(7, "Jul");
            map.put(8, "Aug");
            map.put(9, "Sep");
            map.put(10, "Okt");
            map.put(11, "Nov");
            map.put(12, "Dec");

            return map.get(month);
        }

    }

    public String getName() {
        return name;
    }

    public List<String> getDeveloperStudios() {
        return developerStudios;
    }

    public String getPubDate() {
        return pubDate;
    }
}
