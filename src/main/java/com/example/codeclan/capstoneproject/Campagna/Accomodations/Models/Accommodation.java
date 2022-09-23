package com.example.codeclan.capstoneproject.Campagna.Accomodations.Models;

public abstract class Accommodation {

    private final String name;

    public Accommodation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
