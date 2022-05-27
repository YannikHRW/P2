package de.hrw.progra2.assignment6;
import java.util.ArrayList;
import java.util.List;

    public class GenericListsUtil {

        public static <T extends Number> double sumOfPositiveNumbers(List<T> alist) {
        double summe = 0;
        for (int i = 0; i < alist.size(); i++) {
            double wert = alist.get(i).doubleValue();
            if (wert > 0) {
                summe = summe + wert;
            }
        }
        return summe;
    }


    public static <T> List<T> extractDoubleElements(List<T> alist) {
        List<T> erg = new ArrayList<>();
        for (int i = 0; i < alist.size(); i++) {
            T wert = alist.get(i);
            if (!erg.contains(wert)) {
                erg.add(wert);
            }
        }
        return erg;
    }

    public static void main(String[] args) {
        List<Integer> eineListe = new ArrayList<>();
        eineListe.add(5);
        eineListe.add(5);
        eineListe.add(1);
        eineListe.add(-9);
        eineListe.add(3);
        eineListe.add(3);
        double summe = sumOfPositiveNumbers(eineListe);
        List<Integer> erg = extractDoubleElements(eineListe);
        System.out.println(summe);
        for (Integer i : erg) {
            System.out.println(i);
        }
    }
}