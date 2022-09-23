package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

public class BAndBRoom extends Room{

    public BAndBRoom(String name, RoomType roomType, int price) {
        super(name, roomType, price);
    }

    public int getRoomPrice(BAndBRoom bAndBRoom){
        return bAndBRoom.getPrice();
    }

}
