package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import com.example.codeclan.capstoneproject.Campagna.accomodations.bookings.Booking;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.List;

public abstract class Accommodation {

    @Column
    private String name;

    public Accommodation(String name) {
        this.name = name;
    }

    public Accommodation() {
    }

    public String getName() {
        return name;
    }



    public abstract int makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests);
    public abstract List<LocalDate> getBookedDays();
    public abstract int getCurrentFreeCapacity();
    public abstract boolean accommodationIsBigEnough(int numberOfGuests);


}
