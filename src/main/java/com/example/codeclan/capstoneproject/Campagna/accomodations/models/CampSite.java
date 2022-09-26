//package com.example.codeclan.capstoneproject.Campagna.accomodations.models;
//
//import com.example.codeclan.capstoneproject.Campagna.user.Host;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "campSites")
//public class CampSite extends Accommodation{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column
//    private Long id;
//    @OneToMany(mappedBy = "campSite")
//    @JsonIgnoreProperties({"campSite"})
//    private List<CampSitePitch> sites;
//
//    public CampSite(String name, Host host) {
//        super(name, host);
//        this.sites = new ArrayList<>();
//    }
//
//
//
//    @Override
//    public int makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests) {
//        int numberOfGuestsToBook = numberOfGuests;
//        for (CampSitePitch sitePitch : this.sites){
//            if(sitePitch.isBigEnough(numberOfGuests) || numberOfGuestsToBook != 0){
//                sitePitch.makeBooking(year, month, day, numberOfDays, numberOfGuestsToBook);
//                return numberOfGuestsToBook;
//            }
//        }
//        return 0;
//    }
//
//
//
//    @Override
//    public List<DayBooked> getBookedDays() {
//        List<DayBooked> daysBooked = new ArrayList<>();
//        for(CampSitePitch room : this.sites){
//            daysBooked.addAll(room.getBookedDays());
//        }
//        return daysBooked;
//    }
//
//    @Override
//    public int getCurrentFreeCapacity() {
//        int totalCapacity = 0;
////        for(CampSitePitch campPitch : this.sites){
////            totalCapacity += campPitch.getCapacity();
////        }
//        return totalCapacity;
//    }
//
//    public boolean accommodationIsBigEnough(int numberOfGuests) {
//        if(getCurrentFreeCapacity() < numberOfGuests){
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public int numberOfSites(){
//        return this.sites.size();
//    }
//
//    public void addCampSitePitch(CampSitePitch campSitePitch){
//        this.sites.add(campSitePitch);
//    }
//
//    public int getSitePrice(CampSitePitch campSitePitch){
//        return campSitePitch.getPrice();
//    }
//}
