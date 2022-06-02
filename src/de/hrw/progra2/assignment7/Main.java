package de.hrw.progra2.assignment7;

import javax.naming.Name;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = new LinkedList<>();
        persons.add(new Person("Bob", new BirthDate(22, 1, 1988)));
        persons.add(new Person("Joe", new BirthDate(13, 10, 1975)));
        persons.add(new Person("Ben", new BirthDate(14, 4, 1993)));
        persons.add(new Person("Otto", new BirthDate(25, 9, 1992)));
        persons.add(new Person("Mark", new BirthDate(7, 11, 2000)));
        persons.add(new Person("Marie", new BirthDate(19, 2, 1977)));

        System.out.println(Horoscope.mapPersonToStarSign(persons));


        CoffeeToGo Starbucks = new CoffeeToGo("Cappuchino", 40.0, true, 250);
        CoffeeToGo Tchibo = new CoffeeToGo("Latte Macciato", 27.0, true, 260);
        CoffeeToGo Mcafe = new CoffeeToGo("Esspresso", 100, false, 30);

        LinkedList<CoffeeToGo> coffeeToGoList = new LinkedList<>();
        coffeeToGoList.add(Starbucks);
        coffeeToGoList.add(Tchibo);
        coffeeToGoList.add(Mcafe);

        Collections.sort(coffeeToGoList);
        System.out.println("Nach Namen sortierte Liste: \n" + coffeeToGoList);

        Collections.sort(coffeeToGoList,CoffeeToGo.AMOUNT_COMPARATOR);
        System.out.println("Nach Kaffeemenge in Milliliter sortierte Liste: \n " + coffeeToGoList);

        Collections.sort(coffeeToGoList, CoffeeToGo.PRODUCT_NAME_COMPARATOR);
        System.out.println("Nach alphabetischen Reihenfolge sortierte Liste: \n " + coffeeToGoList );

    }
}
