//package com.example.codeclan.capstoneproject.Campagna.accomodations.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "houseRooms")
//public class HouseRoom extends Room{
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column
//    private Long id;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "house_id", referencedColumnName = "id")
//    @JsonIgnoreProperties({"houseRoom"})
//    private House house;
//
//    public HouseRoom() {
//    }
//
//    public HouseRoom(String name, RoomType roomType, int price, House house) {
//        super(name, roomType, price);
//        this.house = house;
//    }
//}
