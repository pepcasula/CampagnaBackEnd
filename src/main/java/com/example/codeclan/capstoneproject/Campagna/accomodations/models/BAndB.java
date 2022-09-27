//package com.example.codeclan.capstoneproject.Campagna.accomodations.models;
//
//import com.example.codeclan.capstoneproject.Campagna.accomodations.models.BAndBRoom;
//import com.example.codeclan.capstoneproject.Campagna.user.Host;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "BAndBs")
//public class BAndB{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column
//    private Long id;
//    @OneToMany(mappedBy = "bAndB")
//    @JsonIgnoreProperties({"bAndB"})
//    private List<BAndBRoom> bandbRooms;
//    @Column
//    private String name;
//    @ManyToOne
//    @JoinColumn(name = "host_id", referencedColumnName = "id")
//    @JsonIgnoreProperties({"bAndBs"})
//    private Host host;
//
//    public BAndB(String name, Host host) {
//        this.name = name;
//        this.host = host;
//        this.bandbRooms = new ArrayList<>();
//    }
//
//    public BAndB(){
//
//    }
//
//    public List<BAndBRoom> getBandbRooms() {
//        return bandbRooms;
//    }
//
//    public void setBandbRooms(List<BAndBRoom> bandbRooms) {
//        this.bandbRooms = bandbRooms;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Host getHost() {
//        return host;
//    }
//
//    public void setHost(Host host) {
//        this.host = host;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public int makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests) {
//        int numberOfGuestsToBook = numberOfGuests;
//        for (BAndBRoom room : this.bandbRooms){
//            if(room.isBigEnough(numberOfGuests) || numberOfGuestsToBook != 0){
//                room.makeBooking(year, month, day, numberOfDays, numberOfGuestsToBook);
//            }
//        }
//        return numberOfGuestsToBook;
//    }
//
////    public List<LocalDate> getBookedDays() {
////        List<LocalDate> daysBooked = new ArrayList<>();
////        for(BAndBRoom room : this.bandbRooms){
////            daysBooked.addAll(room.getBookedDays());
////        }
////        return daysBooked;
////    }
//
//    private int getCurrentFreeCapacity() {
//        int totalCapacity = 0;
//        for(BAndBRoom room : this.bandbRooms){
//            totalCapacity += room.getCapacity();
//        }
//        return totalCapacity;
//    }
//
//    public boolean accommodationIsBigEnough(int numberOfGuests) {
//        if(getCurrentFreeCapacity() > numberOfGuests){
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public int numberOfRooms(){
//        return this.bandbRooms.size();
//    }
//
//    public void addRoom(BAndBRoom bAndB){
//        this.bandbRooms.add(bAndB);
//    }
//
////    public List<Booking> getBooking() {
////        List<Booking> bookings = new ArrayList<>();
////        for(BAndBRoom room : this.bandbRooms){
////            bookings.addAll(room.getBookings());
////        }
////        return bookings;
////    }
//
////    public int getRoomPrice(BAndBRoom bAndBRoom){
////        return bAndBRoom.getPrice();
////    }
//
//
//}
