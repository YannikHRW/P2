package de.hrw.progra2.assignment7;
import java.util.Comparator;

public class ProductNameComparator implements Comparator<CoffeeToGo> {

    @Override
    public int compare(CoffeeToGo c1, CoffeeToGo c2) {return String.compare(c1.getProductName(),c2.getProductName());}


    }


