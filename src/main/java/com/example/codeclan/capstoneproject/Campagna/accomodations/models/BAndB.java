package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bAndBs")
public class BAndB extends Accommodation{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @OneToMany
    private List<BAndBRoom> rooms;

    public BAndB(String name) {
        super(name);
        this.rooms = new ArrayList<>();
    }

    public BAndB(){

    }

    @Override
    public int makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests) {
        int numberOfGuestsToBook = numberOfGuests;
        for (BAndBRoom room : this.rooms){
            if(room.isBigEnough(numberOfGuests) || numberOfGuestsToBook != 0){
                room.makeBooking(year, month, day, numberOfDays, numberOfGuestsToBook);
                return numberOfGuestsToBook;
            }
        }
        return 0;
    }

    @Override
    public List<LocalDate> getBookedDays() {
        List<LocalDate> daysBooked = new ArrayList<>();
        for(BAndBRoom room : this.rooms){
            daysBooked.addAll(room.getBookedDays());
        }
        return daysBooked;
    }

    @Override
    public int getCurrentFreeCapacity() {
        int totalCapacity = 0;
        for(BAndBRoom room : this.rooms){
            totalCapacity += room.getCapacity();
        }
        return totalCapacity;
    }

    @Override
    public boolean accommodationIsBigEnough(int numberOfGuests) {
        if(getCurrentFreeCapacity() < numberOfGuests){
            return true;
        } else {
            return false;
        }
    }

    public int numberOfRooms(){
        return this.rooms.size();
    }

    public void addRoom(BAndBRoom bAndB){
        this.rooms.add(bAndB);
    }

    public int getRoomPrice(BAndBRoom bAndBRoom){
        return bAndBRoom.getPrice();
    }


}
