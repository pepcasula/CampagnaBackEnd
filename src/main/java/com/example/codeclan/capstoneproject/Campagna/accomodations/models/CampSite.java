package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "campSites")
public class CampSite extends Accommodation{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private List<CampSitePitch> sites;

    public CampSite(String name) {
        super(name);
        this.sites = new ArrayList<>();
    }



    @Override
    public int makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests) {
        int numberOfGuestsToBook = numberOfGuests;
        for (CampSitePitch sitePitch : this.sites){
            if(sitePitch.isBigEnough(numberOfGuests) || numberOfGuestsToBook != 0){
                sitePitch.makeBooking(year, month, day, numberOfDays, numberOfGuestsToBook);
                return numberOfGuestsToBook;
            }
        }
        return 0;
    }



    @Override
    public List<LocalDate> getBookedDays() {
        List<LocalDate> daysBooked = new ArrayList<>();
        for(CampSitePitch campSitePitch : this.sites){
            daysBooked.addAll(campSitePitch.getBookedDays());
        }
        return daysBooked;
    }

    @Override
    public int getCurrentFreeCapacity() {
        int totalCapacity = 0;
        for(CampSitePitch campPitch : this.sites){
            totalCapacity += campPitch.getCapacity();
        }
        return totalCapacity;
    }

    public boolean accommodationIsBigEnough(int numberOfGuests) {
        if(getCurrentFreeCapacity() < numberOfGuests){
            return true;
        } else {
            return false;
        }
    }

    public int numberOfSites(){
        return this.sites.size();
    }

    public void addCampSitePitch(CampSitePitch campSitePitch){
        this.sites.add(campSitePitch);
    }

    public int getSitePrice(CampSitePitch campSitePitch){
        return campSitePitch.getPrice();
    }
}
