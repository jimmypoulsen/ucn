package com.codebind;

import java.util.ArrayList;

public class PersonContainer {
    private static PersonContainer instance = null;
    private ArrayList<Person> persons;

    public static PersonContainer getInstance() {
        if(instance == null) {
            instance = new PersonContainer();
        }
        return instance;
    }

    private PersonContainer() {
        persons = new ArrayList<>();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void addPerson(String firstname, String lastname, int age) {
        persons.add(new Person(firstname, lastname, age));
    }
}
