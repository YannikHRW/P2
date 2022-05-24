package de.hrw.progra2.assignment6;

import java.util.Objects;

public abstract class Videogame implements Comparable<Videogame> {

    public static final PlaytimeComparator AMOUNT_PLAYTIME_COMPARATOR = new PlaytimeComparator();

    private String name;
    private int ageRating;
    private double playtime;
    private boolean isIndexed;

    public Videogame(String name, int ageRating, double playtime, boolean isIndexed) {
        this.name = name;
        this.ageRating = ageRating;
        this.playtime = playtime;
        this.isIndexed = isIndexed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    public double getPlaytime() {
        return playtime;
    }

    public void setPlaytime(double playtime) {
        this.playtime = playtime;
    }

    public boolean isIndexed() {
        return isIndexed;
    }

    public void setIndexed(boolean indexed) {
        isIndexed = indexed;
    }

    @Override
    public int compareTo(Videogame o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Videogame videogame = (Videogame) o;
        return ageRating == videogame.ageRating && Double.compare(videogame.playtime, playtime) == 0 && isIndexed == videogame.isIndexed && Objects.equals(name, videogame.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ageRating, playtime, isIndexed);
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "name='" + name + '\'' +
                ", ageRating=" + ageRating +
                ", playtime=" + playtime +
                ", isIndexed=" + isIndexed +
                '}';
    }
}

