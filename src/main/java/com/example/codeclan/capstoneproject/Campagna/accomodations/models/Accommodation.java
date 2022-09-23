package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

public abstract class Accommodation {

    private final String name;

    public Accommodation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
