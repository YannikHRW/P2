package de.hrw.progra2.assignment8;

/**
 * A Softdrink with amount of unhealthy Substances and Version.
 */
public enum Softdrink {
    COLA(10.6, BeverageVersion.REGULAR),
    COLA_CHERRY(10.7, BeverageVersion.REGULAR),
    FANTA(11.1, BeverageVersion.REGULAR),
    COLA_LIGHT(8.9, BeverageVersion.LIGHT),
    ICETEE_ZERO(12.4, BeverageVersion.ZERO),
    SPRITE(12, BeverageVersion.REGULAR),
    SPRITE_ZERO(11.3, BeverageVersion.ZERO),
    PEPSI(13, BeverageVersion.REGULAR),
    PEPSI_LIGHT(12.5, BeverageVersion.LIGHT);

    /**
     * Amount of unhealthy Substances in the Drink.
     */
    private double unhealthySubstances;
    /**
     * Version of the beverage (Non-Caffeine, Non-Sugar...)
     */
    private BeverageVersion beverageVersion;

    /**
     * Constructor setting basic fields.
     *
     * @param unhealthySubstances
     * @param bV
     */
    Softdrink(double unhealthySubstances, BeverageVersion bV) {
        this.unhealthySubstances = unhealthySubstances;
        this.beverageVersion = bV;
    }

    /**
     * Getter for the Amount of unhealthy substances in the Drink.
     *
     * @return Amount of unhealthy substances in the Drink.
     */
    public double getUnhealthySubstances() {
        return unhealthySubstances;
    }

    /**
     * Getter for the Beverage Version of Drink.
     *
     * @return Beverage Version of Drink.
     */
    public BeverageVersion getBeverageVersion() {
        return beverageVersion;
    }

    /**
     * checks if softdrink contains sugar.
     *
     * @return true if Softdrink contains no sugar, false otherwise
     */
    public boolean hasNoSugar() {
        return getBeverageVersion() != BeverageVersion.REGULAR;
    }

    /**
     *
     * @return Softdrink as a String representation.
     */
    @Override
    public String toString() {
        return "Softdrink{" +
                "unhealthySubstances=" + unhealthySubstances +
                ", beverageVersion=" + beverageVersion +
                '}';
    }
}
