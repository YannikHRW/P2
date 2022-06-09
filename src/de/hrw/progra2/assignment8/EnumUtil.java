package de.hrw.progra2.assignment8;

public class EnumUtil {

    public static boolean isBluffPackage(Softdrink softdrink) {
        if (softdrink.getBeverageVersion() == BeverageVersion.ZERO || softdrink.getBeverageVersion() == BeverageVersion.LIGHT) {
            return softdrink.getUnhealthySubstances() > 8;
        }
        return false;
    }


    public static BeverageVersion getSoftdrinkVersion(String name) {

        try {
            Softdrink softdrink = Softdrink.valueOf(name);
            return softdrink.getBeverageVersion();
        } catch (IllegalArgumentException iae) {
            throw new SoftdrinkDoesNotExistException(name, iae);
        }

    }

}

    /*public int  mapUnheltySubstancesToBeverrageVersion(){
        EnumMap<Softdrink, Double> enumMap = new EnumMap<Softdrink, Double>(Softdrink.class);
        Softdrink.put(Softdrink.COLA, 8.0 );
        Softdrink.put(Softdrink.COLA_LIGHT,5.6);
    }*/
