package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import java.time.LocalDate;
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

    @Override
    public void makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests) {
        for (HotelRoom room : this.rooms){
            if(room.isBigEnough(numberOfGuests)){
                room.makeBooking(day, month, year, numberOfDays);
            }
        }
    }

    @Override
    public List<LocalDate> getBookedDays() {
        List<LocalDate> daysBooked = new ArrayList<>();
        for(HotelRoom room : this.rooms){
            daysBooked.addAll(room.getBookedDays());
        }
        return daysBooked;
    }
}
