package de.hrw.progra2.assignment7;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private String name;
    private BirthDate birthdate;

    public Person(String name, BirthDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BirthDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(BirthDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(birthdate, person.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthdate);
    }

    @Override
    public String toString() {
        return name + ", " + birthdate;
    }

    @Override
    public int compareTo(Person person) {
        int compare = this.name.compareTo(person.name);
        if (compare < 0) {
            return -1;
        } else if (compare == 0){
            return 0;
        } else {
            return 1;
        }
    }
}
