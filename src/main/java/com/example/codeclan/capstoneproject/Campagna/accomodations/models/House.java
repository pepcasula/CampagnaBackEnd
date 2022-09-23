package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

public class House extends Accommodation{

    private int capacity;
    private int currentCapacity;

    public House(String name, int capacity) {
        super(name);
        this.capacity = capacity;
        this.currentCapacity = this.capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean checkIfNotOverCapacity(int guests){
        if(guests < capacity){
            return true;
        } else {
            return false;
        }
    }

    public void bookRoom(){
        this.currentCapacity = 0;
    }

    public void emptyHouse(){
        this.currentCapacity = this.capacity;
    }
}
