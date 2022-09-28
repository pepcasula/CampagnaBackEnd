//package com.example.codeclan.capstoneproject.Campagna.accomodations.models;
//
//import com.example.codeclan.capstoneproject.Campagna.user.Host;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "houses")
//public class House extends Accommodation{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column
//    private Long id;
//    @Column
//    private int capacity;
//    @Column
//    private int price;
//    @Column
//    private int currentCapacity;
//
//    @OneToOne(mappedBy = "house")
//    @JsonIgnoreProperties({"house"})
//    private HouseRoom houseRoom;
//
//    public House(String name, int capacity, int price, HouseRoom houseRoom, Host host) {
//        super(name, host);
//        this.price = price;
//        this.capacity = capacity;
//        this.currentCapacity = this.capacity;
//        this.houseRoom = houseRoom;
//    }
//
//
//
//    public int getCapacity() {
//        return houseRoom.getRoomTypeCapacity();
//    }
//
//    public boolean checkIfNotOverCapacity(int guests){
//        if(guests < capacity){
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void bookRoom(){
//        this.currentCapacity = 0;
//    }
//
//    public void emptyHouse(){
//        this.currentCapacity = this.capacity;
//    }
//
//
//    public List<DayBooked> getBookedDays(){
//        return this.houseRoom.getBookedDays();
//    }
//
//    @Override
//    public int getCurrentFreeCapacity() {
//        return this.currentCapacity;
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
////    private void addBooking(Booking booking){
////        this.bookings.add(booking);
////    }
////
////    private Booking newBooking(int year, int month, int day, int numberOfDays){
////        Booking booking = new Booking(year, month, day, numberOfDays);
////        return booking;
////    }
////
////    private boolean checkNotDoubleBooked(Booking possibleBooking){
////        boolean doubleBooked = false;
////        for(Booking booking : this.bookings){
////            for(LocalDate date : possibleBooking.getDaysBooked()){
////                doubleBooked = Stream.of(booking.getDaysBooked()).anyMatch(dayBooked -> dayBooked.contains(date));
////            }
////        }
////        return doubleBooked;
////    }
////
//    public int makeBooking(int year, int month, int day, int numberOfDays , int numberOfGuests){
//        int numberOfGuestsToBook = numberOfGuests;
////        if(numberOfGuests < this.currentCapacity){
////            Booking possibleBooking = newBooking(year , month , day , numberOfDays );
////            if (checkNotDoubleBooked(possibleBooking)){
////                return 0;
////            } else {
////                addBooking(possibleBooking);
////            }
////        }
//        return numberOfGuestsToBook;
//    }
//
//}
