package de.hrw.progra2.assignment8;

public class UnhealthySubstancesAmountException extends RuntimeException{

    private double inputValue;

    public UnhealthySubstancesAmountException(double inputValue) {
        super("Softdrink with " + inputValue + " unhealthy Substances is not allowed in Germany!");

        this.inputValue = inputValue;
    }

    public double getInputValue() {
        return inputValue;
    }

}
