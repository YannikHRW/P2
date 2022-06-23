package de.hrw.progra2.assignment10.model;

import java.util.Objects;

/**
 * A flower.
 */
public class Flower {
    /** Flower-Species */
    private Species species;

    /** Suitable fertilizer */
    private Fertilizer suitableFertilizer;

    /** Has the flower enough sun? */
    private boolean enoughSun;

    /**
     * Constructor constructing flowers.
     * @param species species of the flower
     * @param suitableFertilizer suitable fertilizer for this flower
     * @param enoughSun true iff flower has enough sun
     */
    public Flower(Species species, Fertilizer suitableFertilizer, boolean enoughSun) {
        this.species = species;
        this.suitableFertilizer = suitableFertilizer;
        this.enoughSun = enoughSun;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Fertilizer getSuitableFertilizer() {
        return suitableFertilizer;
    }

    public void setSuitableFertilizer(Fertilizer suitableFertilizer) {
        this.suitableFertilizer = suitableFertilizer;
    }

    public boolean isEnoughSun() {
        return enoughSun;
    }

    public void setEnoughSun(boolean enoughSun) {
        this.enoughSun = enoughSun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return enoughSun == flower.enoughSun && species == flower.species && suitableFertilizer == flower.suitableFertilizer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, suitableFertilizer, enoughSun);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerSpecies=" + species +
                ", bestFertilizer=" + suitableFertilizer +
                ", enoughSun=" + enoughSun +
                '}';
    }
}
