package com.example.codeclan.capstoneproject.Campagna.user;

import com.example.codeclan.capstoneproject.Campagna.accomodations.models.Accommodation;

import java.util.ArrayList;
import java.util.List;

public class Host extends User{

    private List<Accommodation> accommodations;
    //private List<Booking> bookings;

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

}
