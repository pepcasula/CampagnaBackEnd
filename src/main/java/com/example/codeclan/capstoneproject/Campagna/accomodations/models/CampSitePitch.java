//package com.example.codeclan.capstoneproject.Campagna.accomodations.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "campsitePitches")
//public class CampSitePitch extends Room{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column
//    private Long id;
////    @Column
////    private String name;
////    @Column
////    private int capacity;
////    @Column
////    private int price;
////    @OneToMany(mappedBy = "campSitePitch")
////    @JsonIgnoreProperties({"campSitePitch"})
////    private List<Booking> bookings;
//    @ManyToOne
//    @JsonIgnoreProperties({"campSitePitch"})
//    @JoinColumn(name = "campSite_id", nullable = false)
//    private CampSite campSite;
//
//    public CampSitePitch(String name, RoomType roomType, int price) {
//        super(name, roomType, price);
//    }
//
//
////    public CampSitePitch(String name, int capacity, int price, CampSite campSite){
////        this.name = name;
////        this.capacity = capacity;
////        this.campSite = campSite;
////        this.price = price;
////        this.bookings = new ArrayList<>();
////    }
//
//    public CampSitePitch() {
//    }
//
//
//}
