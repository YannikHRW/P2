package de.hrw.progra2.assignment10;

import de.hrw.progra2.assignment10.model.*;

import java.util.ArrayList;
import java.util.List;

public class GardenShow {
    public static void main(String[] args) {

        List<Flower> flowersInFirstBed = new ArrayList<>();
        flowersInFirstBed.add(new Flower(Species.DAISY, Fertilizer.MINERAL, true));
        flowersInFirstBed.add(new Flower(Species.ORCHID, Fertilizer.GASEOUS, false));
        flowersInFirstBed.add(new Flower(Species.TULIP, Fertilizer.ORGANIC, true));
        flowersInFirstBed.add(new Flower(Species.DAHLIA, Fertilizer.MINERAL, false));

        List<Fertilizer> fertilizersInFirstBed = new ArrayList<>();
        fertilizersInFirstBed.add(Fertilizer.GASEOUS);
        fertilizersInFirstBed.add(Fertilizer.MINERAL);

        Soil soilInFirstBed = new Soil(fertilizersInFirstBed);


        GardenBed firstGardenBed = new GardenBed(flowersInFirstBed, soilInFirstBed);

        InformationPanel informationPanel = new InformationPanel();
        informationPanel.printFlowerInformationForGardenBed(firstGardenBed);
        informationPanel.printFlowersWithAdequateFertilizer(firstGardenBed);
    }
}
