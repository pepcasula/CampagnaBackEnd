package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends Accommodation{

    private List<HotelRoom> rooms;

    public Hotel(String name) {
        super(name);
        this.rooms = new ArrayList<>();
    }

    public int numberOfRooms(){
        return this.rooms.size();
    }

    public void addRoom(HotelRoom room){
        this.rooms.add(room);
    }

    public int getRoomPrice(HotelRoom hotelRoom){
        return hotelRoom.getPrice();
    }
}
