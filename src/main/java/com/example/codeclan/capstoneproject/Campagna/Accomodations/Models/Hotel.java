package com.example.codeclan.capstoneproject.Campagna.Accomodations.Models;

import com.example.codeclan.capstoneproject.Campagna.Accomodation.Models.HotelRoom;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends Accommodation{

    private List<HotelRoom> rooms;

    public Hotel(String name) {
        super(name);
        this.rooms = new ArrayList<>();
    }
}
