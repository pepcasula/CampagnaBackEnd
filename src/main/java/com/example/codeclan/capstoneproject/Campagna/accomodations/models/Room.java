package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import com.example.codeclan.capstoneproject.Campagna.accomodations.bookings.Booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class Room {

    // test comment

    private String name;
    private RoomType roomType;
    private int price;
    private List<Booking> bookings;

    public Room(String name, RoomType roomType, int price) {
        this.name = name;
        this.roomType = roomType;
        this.price = price;
        this.bookings = new ArrayList<>();
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

    public boolean isBigEnough(int numberOfGuests){
        if(numberOfGuests < getRoomTypeCapacity()){
            return true;
        } else {
            return false;
        }
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
            for(LocalDate date : possibleBooking.getDaysBooked()){
                doubleBooked = Stream.of(booking.getDaysBooked()).anyMatch(dayBooked -> dayBooked.contains(date));
            }
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
