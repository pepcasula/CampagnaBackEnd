package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

public abstract class Room {

    // test comment

    private String name;
    private RoomType roomType;
    private int price;

    public Room(String name, RoomType roomType, int price) {
        this.name = name;
        this.roomType = roomType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoomType getRoomType() {
        return roomType;
    }
    public  int getRoomTypeCapacity(){
        return this.roomType.getCapacity();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
