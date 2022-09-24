package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import com.example.codeclan.capstoneproject.Campagna.accomodations.bookings.Booking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class Accommodation {

    private final String name;

    public Accommodation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
