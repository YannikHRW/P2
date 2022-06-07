package de.hrw.progra2.assignment8;

public class UnhealthySubstancesAmountException extends RuntimeException{

    private double inputValue;

    /**
     * Constructor with input value.
     * @param inputValue value
     */
    public UnhealthySubstancesAmountException(double inputValue) {
        super("Softdrink with " + inputValue + " unhealthy Substances is not allowed in Germany!");

        this.inputValue = inputValue;
    }

    /**
     * Returns input value.
     * @return input value
     */
    public double getInputValue() {
        return inputValue;
    }

}
