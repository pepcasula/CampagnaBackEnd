package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

public class CampSitePitch extends Room{

    public CampSitePitch(String name, int capacity, int price) {
        super(name, capacity, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
