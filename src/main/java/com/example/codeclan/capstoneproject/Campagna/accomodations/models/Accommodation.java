package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import com.example.codeclan.capstoneproject.Campagna.accomodations.bookings.Booking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class Accommodation {

    private final String name;
    private List<Booking> bookings;

    public Accommodation(String name) {
        this.name = name;
        this.bookings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    //not sure if these methods need to be here or in room
    public void addBooking(Booking booking){
        this.bookings.add(booking);
    }

    public Booking makeBooking(int day, int month, int year, int numberOfDays){
        Booking booking = new Booking(day, month, year, numberOfDays);
        return booking;
    }

    public boolean checkNotDoubleBooked(Booking possibleBooking){
        boolean doubleBooked = false;
        for(Booking booking : this.bookings){
            doubleBooked = Stream.of(booking.getDaysBooked()).anyMatch(possibleBooking.getDaysBooked()::contains);
        }
        return doubleBooked;
    }

    //overall booking
}
