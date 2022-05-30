package de.hrw.progra2.assignment7;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new LinkedList<>();
        persons.add(new Person("Bob", new BirthDate(22, 1, 1988)));
        persons.add(new Person("Joe", new BirthDate(13, 10, 1975)));
        persons.add(new Person("Margaret", new BirthDate(14, 4, 1993)));
        persons.add(new Person("Marie", new BirthDate(25, 9, 1992)));
        persons.add(new Person("Fabian", new BirthDate(7, 11, 2000)));
        persons.add(new Person("Otto", new BirthDate(19, 2, 1977)));

        System.out.println(Horoscope.mapPersonToStarSign(persons));

    }

}
