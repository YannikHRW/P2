package de.hrw.progra2.assignment6;

import java.util.Comparator;

public class PlaytimeComparator implements Comparator<Videogame> {

    @Override
    public int compare(Videogame o1, Videogame o2) {
        return Double.compare(o1.getPlaytime(), o2.getPlaytime());
    }
}
