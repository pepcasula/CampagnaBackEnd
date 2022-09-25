package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hotels")
public class Hotel extends Accommodation{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private List<HotelRoom> rooms;

    public Hotel(String name) {
        super(name);
        this.rooms = new ArrayList<>();
    }


    public int numberOfRooms(){
        return this.rooms.size();
    }

    public void addRoom(HotelRoom room){
        this.rooms.add(room);
    }

    public int getRoomPrice(HotelRoom hotelRoom){
        return hotelRoom.getPrice();
    }

    @Override
    public int makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests) {
        int numberOfGuestsToBook = numberOfGuests;
        for (HotelRoom room : this.rooms){
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
        for(HotelRoom room : this.rooms){
            daysBooked.addAll(room.getBookedDays());
        }
        return daysBooked;
    }

    @Override
    public int getCurrentFreeCapacity() {
        int totalCapacity = 0;
        for(HotelRoom room : this.rooms){
            totalCapacity += room.getCapacity();
        }
        return totalCapacity;
    }
}
