package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import javax.persistence.*;

@Entity
@Table(name = "hotelRooms")
public class HotelRoom extends Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    public HotelRoom(String name, RoomType roomType, int price) {
        super(name, roomType, price);
    }


    public int getCapacity(){
        return this.getRoomType().getCapacity();
    }



}
