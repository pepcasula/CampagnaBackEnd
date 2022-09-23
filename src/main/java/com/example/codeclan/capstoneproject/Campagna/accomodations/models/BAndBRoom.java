package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

public class BAndBRoom extends Room{

    public BAndBRoom(String name, int capacity, int price) {
        super(name, capacity, price);
    }

    public int getRoomPrice(BAndBRoom bAndBRoom){
        return bAndBRoom.getPrice();
    }

}
