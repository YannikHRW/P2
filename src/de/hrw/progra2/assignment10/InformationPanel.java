package de.hrw.progra2.assignment10;

import de.hrw.progra2.assignment10.model.*;

import java.util.*;
import java.util.concurrent.Flow;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class InformationPanel {

    /**
     * For each flower in a garden bed, this method prints the species and
     * whether the flower has enough sunlight.
     * @param gardenBed a garden bed
     */
    public void printFlowerInformationForGardenBed(GardenBed gardenBed) {
        gardenBed.getFlowers().stream().map(x -> x.getSpecies() + "\n -> has enough sun: " + x.isEnoughSun()).forEach(System.out::println);
    }

    /**
     * Prints every flower of a garden bed that has a preferred fertilizer
     * which is also within the soil of the garden bed.
     * @param gardenBed a garden bed
     */
    public void printFlowersWithAdequateFertilizer(GardenBed gardenBed) {
        gardenBed.getFlowers().stream().filter(x -> gardenBed.getSoil().getFertilizers().contains(x.getSuitableFertilizer())).forEach(System.out::println);
    }

    /**
     * Returns garden beds that do not use a given fertilizer.
     * @param gardenBeds an array of garden beds
     * @param fertilizer forbidden fertilizer
     * @return Returns garden beds that do not include the forbidden fertilizer.
     */
    public List<GardenBed> getGardenBedsByFertilizer(GardenBed[] gardenBeds, Fertilizer fertilizer) {
        return Arrays.stream(gardenBeds).filter(x -> !x.getSoil().getFertilizers().contains(fertilizer)).toList();
    }

    /**
     * Calculates the average visitors for given botanical gardens.
     * @param botanicalGardens List of botanical gardens
     * @return Average amount of visitors
     */
    public double getAverageVisitorsForBotanicalGardens(List<BotanicalGarden> botanicalGardens) {
        return botanicalGardens.stream().collect(Collectors.averagingDouble(BotanicalGarden::getTotalVisitorsPerYear));
    }

    /**
     * Counts all flowers within a garden bed by species.
     * @param botanicalGarden garden bed
     * @return Returns a map, mapping the species to the number of flowers of that species.
     */
    public Map<Species, Long> getGroupedFlowersBySpeciesOfBotanicalGarden(BotanicalGarden botanicalGarden) {
        Map <Species, Long> map;

        //Eigentlich wollte ich hier alle Flowers zählen, welche der angegebenen Spezies entsprechen. Allerdings verstehe ich nicht, wieso ich hier nur Referenzen auf Streams ansgegeben bekomme...
        botanicalGarden.getGardenBeds().stream().map(gardenBed -> gardenBed.getFlowers().stream().filter(flower -> flower.getSpecies() == Species.DAHLIA)).forEach(System.out::println);

        return null;
    }

    /**
     * Returns all garden beds from given list of graden beds that contain given flower.
     * @param gardenBeds list of garden beds
     * @param flower flow to search for
     * @return Returns a list of graden beds that contain given flower
     */
    public List<GardenBed> getGardenBedsWithSpecificFlower(List<GardenBed> gardenBeds, Flower flower) {
        return gardenBeds.stream().filter(x -> x.getFlowers().stream().anyMatch((flower1 -> flower1.equals(flower)))).toList();
    }

    // === EXTRA EXERCISE ===

    /**
     * Calculates the sum of daisy flowers within a botanical garden.
     * @param botanicalGarden
     * @return Number of daisy flowers
     */
    public long getNumberOfDaisyFlowers(BotanicalGarden botanicalGarden) {
        long counter = 0;
        //botanicalGarden.getGardenBeds().stream().map(x -> x.getFlowers().stream().flatMap(Collection::stream));
        return 0;
    }
}
