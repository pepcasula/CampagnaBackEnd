//package com.example.codeclan.capstoneproject.Campagna.accomodations.models;
//
//import com.example.codeclan.capstoneproject.Campagna.user.Host;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.util.List;
//
//public abstract class Accommodation {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column
//    private Long id;
//
//    @Column
//    private String name;
//    @ManyToOne
//    @JsonIgnoreProperties({"accommodation"})
//    @JoinColumn(name = "host_id", nullable = false)
//    private Host host;
//
//    public Accommodation(String name, Host host) {
//        this.name = name;
//        this.host = host;
//    }
//
//    public Accommodation() {
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
//    public abstract int makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests);
//    public abstract List<DayBooked> getBookedDays();
//    public abstract int getCurrentFreeCapacity();
//    public abstract boolean accommodationIsBigEnough(int numberOfGuests);
//
//
//}
