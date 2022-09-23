package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    TWIN(2),
    TRIPLE(3),
    FAMILY(4);

    private final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }
}