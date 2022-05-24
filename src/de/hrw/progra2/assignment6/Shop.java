package de.hrw.progra2.assignment6;

import java.util.*;

public class Shop {

    private List<Videogame> list;

    public Shop() {
        list = new LinkedList<>();
    }

    public void add(Videogame videogame) {
        list.add(videogame);
    }

    public void delete(Videogame videogame) {
        Iterator<Videogame> it = list.iterator();
        while (it.hasNext()) {
            Videogame currentGame = it.next();
            if (currentGame.getClass().equals(videogame.getClass())) {
                it.remove();
            }
        }
    }

    public Videogame retrieveLast() {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(list.size() - 1);
        }
    }

    public List<Videogame> getVideogamesOfAge(int age) {
        List<Videogame> ageList = new LinkedList<>();
        for (Videogame currentGame : list) {
            if (currentGame.getAgeRating() == age) {
                ageList.add(currentGame);
            }
        }
        return ageList;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "list=" + list +
                '}';
    }

    public static void main(String[] args) {

        CD cd1 = new CD("Harry Potter", 16, 20, false);
        Digital digital1 = new Digital("Findet Nemo", 0, 10, false);
        FloppyDisk floppyDisk1 = new FloppyDisk("Call of Duty", 18, 50, true);
        CD cd2 = new CD("Peter Pan", 0, 40, false);
        Digital digital2 = new Digital("Lego Starwars", 6, 34, false);
        FloppyDisk floppyDisk2 = new FloppyDisk("Quake", 18, 60, true);


        List<Videogame> videogameList = new LinkedList<>();
        videogameList.add(cd1);
        videogameList.add(digital1);
        videogameList.add(floppyDisk1);
        videogameList.add(cd2);
        videogameList.add(digital2);
        videogameList.add(floppyDisk2);

        Collections.sort(videogameList);
        System.out.println("Nach Namen sortierte Liste: \n" + videogameList);

        Collections.sort(videogameList, Videogame.AMOUNT_PLAYTIME_COMPARATOR);
        System.out.println("Nach Playtime sortierte Liste: \n" + videogameList);

        System.out.println();

        Shop shop = new Shop();

        shop.add(cd1);
        shop.add(digital1);
        shop.add(floppyDisk1);
        shop.add(cd2);
        shop.add(digital2);
        shop.add(floppyDisk2);

        System.out.println("Shop nachdem die Spiele hinzugefügt wurden:\n" + shop);

        shop.delete(cd1);

        System.out.println("Shop nachdem alle CDs gelöscht wurde \n" + shop);

        System.out.println("Das letzte Spiel im Shop:\n" + shop.retrieveLast());

        System.out.println("Spiele die ab 18 sind: \n" + shop.getVideogamesOfAge(18));

    }

}
