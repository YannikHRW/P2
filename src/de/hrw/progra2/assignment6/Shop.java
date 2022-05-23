package de.hrw.progra2.assignment6;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Videogame> list;

    public Shop() {
        list = new ArrayList<>(); //Doch besser keine Array list, siehe s.14
    }

    public void add(Videogame videogame) {
        list.add(videogame);
    }

    public void delete(Videogame videogame) {
        List<Videogame> list1 = new ArrayList<>();
        for (Videogame game : list) {
            if (videogame.getClass().equals(game.getClass())) {
                System.out.println(game);
                list1.add(game);
                //list.remove(game);
            }
        }
        list.removeAll(list1);
    }

    public Videogame retrieveLast() {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(list.size() - 1);
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "list=" + list +
                '}';
    }
}
