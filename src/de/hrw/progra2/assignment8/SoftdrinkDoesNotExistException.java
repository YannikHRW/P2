package de.hrw.progra2.assignment8;

public class SoftdrinkDoesNotExistException extends RuntimeException {

    private String name;

    /**
     * Constructor with input value.
     *
     * @param name value
     */
    public SoftdrinkDoesNotExistException(String name, Exception causedBy) {
        super("Softdrink '" + name + "' does not exist! " + causedBy);

        this.name = name;
    }

    /**
     * Returns input value.
     *
     * @return input value
     */
    public String getName() {
        return name;
    }

}
