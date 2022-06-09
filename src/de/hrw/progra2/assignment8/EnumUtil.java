package de.hrw.progra2.assignment8;

public class EnumUtil {

    /**
     * Checks if Softdrink is a bluss package.
     *
     * @param softdrink An Enum of type "Softdrink".
     * @return true if beverage version of Softdrink is zero or light AND amount of unhelathy substances is higher than 8, false otherwise
     */
    public static boolean isBluffPackage(Softdrink softdrink) {
        if (softdrink.getBeverageVersion() == BeverageVersion.ZERO || softdrink.getBeverageVersion() == BeverageVersion.LIGHT) {
            return softdrink.getUnhealthySubstances() > 8;
        }
        return false;
    }

    /**
     * Gets the beverage version of a softdrink.
     *
     * @param name of the Softdrink.
     * @return Beverage version of the softdrink if the name of the Softdrink is a valid softdrink.
     * @throws SoftdrinkDoesNotExistException if name of softdrink is not a valid softdrink.
     */
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
