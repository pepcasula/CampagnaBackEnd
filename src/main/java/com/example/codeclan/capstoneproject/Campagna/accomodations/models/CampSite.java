package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CampSite extends Accommodation{

    private List<CampSitePitch> sites;

    public CampSite(String name) {
        super(name);
        this.sites = new ArrayList<>();
    }

    @Override
    public void makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests) {
        for (CampSitePitch sitePitch : this.sites){
            if(sitePitch.isBigEnough(numberOfGuests)){
                sitePitch.makeBooking(day, month, year, numberOfDays);
            }
        }
    }

    @Override
    public List<LocalDate> getBookedDays() {
        List<LocalDate> daysBooked = new ArrayList<>();
        for(CampSitePitch campSitePitch : this.sites){
            daysBooked.addAll(campSitePitch.getBookedDays());
        }
        return daysBooked;
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
