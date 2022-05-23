package de.hrw.progra2.assignment6;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        CD cd = new CD("Harry Popper", 16, 20, true);
        Digital digital = new Digital("Findet Nemo", 0, 30, true);
        FloppyDisk floppyDisk = new FloppyDisk("Call of Duty", 18, 10, true);
        CD cd2 = new CD("Peter Pan", 0, 40, true);

        List<Videogame> videogameList = new LinkedList<>();
        videogameList.add(cd);
        videogameList.add(digital);
        videogameList.add(floppyDisk);

        Collections.sort(videogameList);
        System.out.println(videogameList);

        Collections.sort(videogameList, new PlaytimeComparator());
        System.out.println(videogameList);

        String[] names = {"Mary", "James", "Patricia", "John", "Jennifer", "Robert"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Videogame[] videogames = {cd, digital, floppyDisk};

        Arrays.sort(videogames);
        System.out.println(Arrays.toString(videogames));

        System.out.println();System.out.println();System.out.println();


        Shop shop = new Shop();

        shop.add(cd);
        shop.add(digital);
        shop.add(floppyDisk);
        shop.add(cd2);

        System.out.println(shop);

        shop.delete(cd);

        System.out.println(shop);


    }

}
