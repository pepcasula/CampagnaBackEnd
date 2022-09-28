//package com.example.codeclan.capstoneproject.Campagna.accomodations.models;
//
//import com.example.codeclan.capstoneproject.Campagna.accomodations.models.Booking;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "daysBooked")
//public class DayBooked {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "booking_id", nullable = false)
//    @JsonIgnoreProperties({"daysBooked"})
//    private Booking booking;
//
//    @Column
//    private LocalDate date;
//
//    public DayBooked() {
//    }
//
//    public DayBooked(Booking booking, int year, int month, int day) {
//        this.booking = booking;
//        this.date = LocalDate.of(year, month, day);
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
//    public Booking getBooking() {
//        return booking;
//    }
//
//    public void setBooking(Booking booking) {
//        this.booking = booking;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
//
//    public void setDate( int year, int month, int day) {
//        this.date = LocalDate.of(year, month, day);
//    }
//
//    public int getDayOfMonth() {
//        return this.date.getDayOfMonth();
//    }
//
//    public int getMonthValue() {
//        return this.date.getMonthValue();
//    }
//
//    public int getYear() {
//        return this.date.getYear();
//    }
//}
