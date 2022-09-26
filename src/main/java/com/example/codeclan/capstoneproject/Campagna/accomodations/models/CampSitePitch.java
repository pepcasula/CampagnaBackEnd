package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import com.example.codeclan.capstoneproject.Campagna.accomodations.bookings.Booking;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Entity
@Table(name = "campsitePitches")
public class CampSitePitch{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private int capacity;
    @Column
    private int price;
    @Column
    private List<Booking> bookings;

    public CampSitePitch(String name, int capacity, int price){
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.bookings = new ArrayList<>();
    }

    public CampSitePitch() {
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

    public Booking newBooking(int year, int month, int day, int numberOfDays){
        Booking booking = new Booking(year, month, day, numberOfDays);
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

    public int makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests){
        Booking possibleBooking = newBooking(year , month , day , numberOfDays );
        if (checkNotDoubleBooked(possibleBooking)){
            return 0;
        } else {
            addBooking(possibleBooking);
            return numberOfGuests;
        }
    }

    public boolean isBigEnough(int numberOfGuests) {
        if(numberOfGuests < this.capacity){
            return true;
        } else {
            return false;
        }
    }
}
