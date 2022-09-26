package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import com.example.codeclan.capstoneproject.Campagna.accomodations.bookings.Booking;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Entity
@Table(name = "houses")
public class House extends Accommodation{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private int capacity;
    @Column
    private int price;
    @Column
    private int currentCapacity;
    @Column
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

    @Override
    public int getCurrentFreeCapacity() {
        return this.currentCapacity;
    }

    public boolean accommodationIsBigEnough(int numberOfGuests) {
        if(getCurrentFreeCapacity() < numberOfGuests){
            return true;
        } else {
            return false;
        }
    }

    private void addBooking(Booking booking){
        this.bookings.add(booking);
    }

    private Booking newBooking(int year, int month, int day, int numberOfDays){
        Booking booking = new Booking(year, month, day, numberOfDays);
        return booking;
    }

    private boolean checkNotDoubleBooked(Booking possibleBooking){
        boolean doubleBooked = false;
        for(Booking booking : this.bookings){
            for(LocalDate date : possibleBooking.getDaysBooked()){
                doubleBooked = Stream.of(booking.getDaysBooked()).anyMatch(dayBooked -> dayBooked.contains(date));
            }
        }
        return doubleBooked;
    }

    public int makeBooking(int year, int month, int day, int numberOfDays , int numberOfGuests){
        int numberOfGuestsToBook = numberOfGuests;
        if(numberOfGuests < this.currentCapacity){
            Booking possibleBooking = newBooking(year , month , day , numberOfDays );
            if (checkNotDoubleBooked(possibleBooking)){
                return 0;
            } else {
                addBooking(possibleBooking);
            }
        }
        return numberOfGuestsToBook;
    }

}
