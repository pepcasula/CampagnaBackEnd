package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BAndB extends Accommodation{

    private List<BAndBRoom> rooms;

    public BAndB(String name) {
        super(name);
        this.rooms = new ArrayList<>();
    }

    @Override
    public void makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests) {
        for (BAndBRoom room : this.rooms){
            if(room.isBigEnough(numberOfGuests)){
                room.makeBooking(day, month, year, numberOfDays);
            }
        }
    }

    @Override
    public List<LocalDate> getBookedDays() {
        List<LocalDate> daysBooked = new ArrayList<>();
        for(BAndBRoom room : this.rooms){
            daysBooked.addAll(room.getBookedDays());
        }
        return daysBooked;
    }

    public int numberOfRooms(){
        return this.rooms.size();
    }

    public void addRoom(BAndBRoom bAndB){
        this.rooms.add(bAndB);
    }

    public int getRoomPrice(BAndBRoom bAndBRoom){
        return bAndBRoom.getPrice();
    }


}
