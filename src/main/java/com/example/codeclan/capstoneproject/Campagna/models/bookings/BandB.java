package com.example.codeclan.capstoneproject.Campagna.models.bookings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "BandBs")
public class BandB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @OneToMany(mappedBy = "bandb")
    @JsonIgnoreProperties({"bandb"})
    private List<Booking> bookings;

    public BandB(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public BandB() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
