package de.hrw.progra2.assignment8;

/**
 *
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

    private double unhealthySubstances;
    private BeverageVersion beverageVersion;
    Softdrink(double unhealthySubstances, BeverageVersion bV) {
        this.unhealthySubstances = unhealthySubstances;
        this.beverageVersion = bV;
    }

    public double getUnhealthySubstances() {
        return unhealthySubstances;
    }
    public BeverageVersion getBeverageVersion() {
        return beverageVersion;
    }

    @Override
    public String toString() {
        return "Softdrink{" +
                "unhealthySubstances=" + unhealthySubstances +
                ", beverageVersion=" + beverageVersion +
                '}';
    }
}
