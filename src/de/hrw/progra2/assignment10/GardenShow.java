package de.hrw.progra2.assignment10;

import de.hrw.progra2.assignment10.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GardenShow {
    public static void main(String[] args) {

        List<Flower> flowersInFirstBed = new ArrayList<>();
        flowersInFirstBed.add(new Flower(Species.DAISY, Fertilizer.MINERAL, true));
        flowersInFirstBed.add(new Flower(Species.ORCHID, Fertilizer.GASEOUS, false));
        flowersInFirstBed.add(new Flower(Species.TULIP, Fertilizer.ORGANIC, true));
        flowersInFirstBed.add(new Flower(Species.DAHLIA, Fertilizer.MINERAL, false));
        flowersInFirstBed.add(new Flower(Species.DAHLIA, Fertilizer.ORGANIC, true));

        List<Fertilizer> fertilizersInFirstBed = new ArrayList<>();
        fertilizersInFirstBed.add(Fertilizer.GASEOUS);
        fertilizersInFirstBed.add(Fertilizer.MINERAL);

        Soil soilInFirstBed = new Soil(fertilizersInFirstBed);
        GardenBed firstGardenBed = new GardenBed(flowersInFirstBed, soilInFirstBed);
        InformationPanel informationPanel = new InformationPanel();

        //a)
        informationPanel.printFlowerInformationForGardenBed(firstGardenBed);


        //b)
        informationPanel.printFlowersWithAdequateFertilizer(firstGardenBed);


        List<Flower> flowersInSecondBed = new ArrayList<>();
        flowersInSecondBed.add(new Flower(Species.DAISY, Fertilizer.GASEOUS, true));
        flowersInSecondBed.add(new Flower(Species.ORCHID, Fertilizer.MINERAL, true));
        flowersInSecondBed.add(new Flower(Species.TULIP, Fertilizer.ORGANIC, false));
        flowersInSecondBed.add(new Flower(Species.DAHLIA, Fertilizer.ORGANIC, false));

        List<Fertilizer> fertilizersInSecondBed = new ArrayList<>();
        fertilizersInSecondBed.add(Fertilizer.GASEOUS);
        fertilizersInSecondBed.add(Fertilizer.ORGANIC);

        Soil soilInSecondBed = new Soil(fertilizersInSecondBed);
        GardenBed secondGardenBed = new GardenBed(flowersInSecondBed, soilInSecondBed);

        GardenBed[] gardenBeds = {firstGardenBed, secondGardenBed};

        //c)
        System.out.println(informationPanel.getGardenBedsByFertilizer(gardenBeds, Fertilizer.MINERAL));


        List <GardenBed> gardenBedList = Arrays.asList(gardenBeds);

        BotanicalGarden firstBotanicalGarden = new BotanicalGarden(gardenBedList, LocalDate.parse("2022-07-01"), LocalDate.parse("2022-08-31"), 5000);
        BotanicalGarden secondBotanicalGarden = new BotanicalGarden(gardenBedList, LocalDate.parse("2022-09-01"), LocalDate.parse("2022-12-31"), 10000);

        List <BotanicalGarden> botanicalGardens = new ArrayList<>();

        botanicalGardens.add(firstBotanicalGarden);
        botanicalGardens.add(secondBotanicalGarden);

        //d)
        System.out.println(informationPanel.getAverageVisitorsForBotanicalGardens(botanicalGardens));

        //e)
        System.out.println(informationPanel.getGroupedFlowersBySpeciesOfBotanicalGarden(firstGardenBed));


        //f)
        System.out.println(informationPanel.getGardenBedsWithSpecificFlower(gardenBedList, new Flower(Species.DAISY, Fertilizer.MINERAL, true)));

    }
}
