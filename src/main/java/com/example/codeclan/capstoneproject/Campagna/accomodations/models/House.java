package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import com.example.codeclan.capstoneproject.Campagna.accomodations.bookings.Booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class House extends Accommodation{

    private int capacity;
    private int price;
    private int currentCapacity;
    private List<Booking> bookings;

    public House(String name, int capacity, int price) {
        super(name);
        this.price = price;
        this.capacity = capacity;
        this.currentCapacity = this.capacity;
        this.bookings = new ArrayList<>();
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

    public List<Booking> getBookings() {
        return bookings;
    }

    public List<LocalDate> getBookedDays(){
        List<LocalDate> daysRoomIsBooked = new ArrayList<>();
        for(Booking booking : this.bookings){
            daysRoomIsBooked.addAll(booking.getDaysBooked());
        }
        return daysRoomIsBooked;
    }

    public void addBooking(Booking booking){
        this.bookings.add(booking);
    }

    public Booking newBooking(int day, int month, int year, int numberOfDays){
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

    public void makeBooking(int day, int month, int year, int numberOfDays){
        Booking possibleBooking = newBooking(day , month , year , numberOfDays );
        if (checkNotDoubleBooked(possibleBooking)){
            return;
        } else {
            addBooking(possibleBooking);
        }
    }
}
