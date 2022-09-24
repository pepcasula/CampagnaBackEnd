package com.example.codeclan.capstoneproject.Campagna.user;

import com.example.codeclan.capstoneproject.Campagna.accomodations.models.Accommodation;

import java.util.ArrayList;
import java.util.List;

public class Host extends User{

    private List<Accommodation> accommodations;

    public Host(String name, String info) {
        super(name, info);
        this.accommodations = new ArrayList<>();
    }

    private int getNumberOfAccommodations(){
        return this.accommodations.size();
    }

    private void addAccommodation(Accommodation accommodation){
        this.accommodations.add(accommodation);
    }

    // maybe change makeBooking method to return Boolean so that if it has need booked it could check something else
    private void makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests){
        for(Accommodation accommodation : this.accommodations){
            accommodation.makeBooking(year, month, day, numberOfDays, numberOfGuests);
        }
    }

}
