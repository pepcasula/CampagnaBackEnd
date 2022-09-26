//package com.example.codeclan.capstoneproject.Campagna.accomodations.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "hotelRooms")
//public class HotelRoom extends Room {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column
//    private Long id;
//    @ManyToOne
//    @JsonIgnoreProperties({"hotelRoom"})
//    @JoinColumn(name = "hotel_id", nullable = false)
//    private Hotel hotel;
//    public HotelRoom(String name, RoomType roomType, int price, Hotel hotel) {
//        super(name, roomType, price);
//        this.hotel = hotel;
//    }
//
//
//
//
//    public int getCapacity(){
//        return this.getRoomType().getCapacity();
//    }
//
//
//
//}
