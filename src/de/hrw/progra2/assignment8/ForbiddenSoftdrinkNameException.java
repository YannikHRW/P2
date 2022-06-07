package de.hrw.progra2.assignment8;

public class ForbiddenSoftdrinkNameException extends RuntimeException{

    private String name;

    /**
     * Constructor with name value.
     * @param name value
     */
    public ForbiddenSoftdrinkNameException(String name) {
        super("Softdrink with name '" + name + "' is illegal!");

        this.name = name;
    }

    /**
     * Returns name value.
     * @return name value
     */
    public String getName() { return name; }
}
