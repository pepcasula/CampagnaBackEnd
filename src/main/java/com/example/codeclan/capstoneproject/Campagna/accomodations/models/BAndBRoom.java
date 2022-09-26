package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import javax.persistence.*;
@Entity
@Table(name = "bAndBRooms")
public class BAndBRoom extends Room{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    public BAndBRoom(String name, RoomType roomType, int price) {
        super(name, roomType, price);
    }

    public int getRoomPrice(BAndBRoom bAndBRoom){
        return bAndBRoom.getPrice();
    }

    public int getCapacity(){
        return this.getRoomType().getCapacity();
    }

}
