package de.hrw.progra2.assignment7;
import java.util.Comparator;

public class ProductNameComparator implements Comparator<CoffeeToGo> {

    @Override
    public int compare(CoffeeToGo coffee1, CoffeeToGo coffee2) {
        return coffee1.getProductName().compareTo(coffee2.getProductName());
    }

}


