package de.hrw.progra2.assignment7;

import java.util.Comparator;

public class AmountComparator implements Comparator<CoffeeToGo> {
    @Override
    public int compare(CoffeeToGo o1, CoffeeToGo o2) {
        return Double.compare(o1.getCaffeineContent(), o2.getCaffeineContent());
    }
}


