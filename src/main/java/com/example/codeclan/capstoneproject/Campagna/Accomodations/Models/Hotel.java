package com.example.codeclan.capstoneproject.Campagna.Accomodations.Models;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends Accommodation{

    private List<HotelRoom> rooms;

    public Hotel(String name) {
        super(name);
        this.rooms = new ArrayList<>();
    }
}
