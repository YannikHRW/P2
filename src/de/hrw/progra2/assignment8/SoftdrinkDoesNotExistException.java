package de.hrw.progra2.assignment8;

public class SoftdrinkDoesNotExistException extends RuntimeException {

    private String name;

    /**
     * Constructor with input name and the thrown exception which caused it.
     *
     * @param name name
     */
    public SoftdrinkDoesNotExistException(String name, Exception causedBy) {
        super("Softdrink '" + name + "' does not exist! " + causedBy);

        this.name = name;
    }

    /**
     * Returns input name.
     *
     * @return input name
     */
    public String getName() {
        return name;
    }

}
