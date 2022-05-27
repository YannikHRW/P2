package de.hrw.progra2.assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList<T> {
    private List<T> items;
    private ArrayList<Integer> benutztePositionen;
    private Random random;

    public RandomList(){
        items = new ArrayList<>();
        benutztePositionen = new ArrayList<>();
        random = new Random();
    }
    public void add(T newItem){
        items.add(newItem);
    }

    public T get(){
        int k = random.nextInt(items.size());
        while(benutztePositionen.contains(k)){
            k = random.nextInt(items.size());
        }
        benutztePositionen.add(k);
        if(benutztePositionen.size() == items.size()){
            benutztePositionen.clear();
        }
        T erg = items.get(k);
        return erg;
    }
}
