package de.hrw.progra2.assignment7;

import java.util.Comparator;

public class AmountComparator implements Comparator<CoffeeToGo> {
    @Override
    public int compare(CoffeeToGo coffee1, CoffeeToGo coffee2) {
        return Double.compare(coffee1.getAmount(), coffee2.getAmount());
    }
}


