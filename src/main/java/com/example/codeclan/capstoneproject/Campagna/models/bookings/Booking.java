package com.example.codeclan.capstoneproject.Campagna.models.bookings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @ManyToOne
    @JsonIgnoreProperties({"booking"})
    @JoinColumn(name = "bandb_id", nullable = false)
    private BandB bandb;
    @Column
    private LocalDate startDate;
    @Column
    private LocalDate endDate;
    @Column
    private boolean status;
    @Column
    private boolean available;
    @Column
    private int numberOfGuests;

    public Booking(BandB bandb, LocalDate startDate, LocalDate endDate, int numberOfGuests) {
        this.bandb = bandb;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = false;
        this.available = false;
        this.numberOfGuests = numberOfGuests;
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public BandB getBandb() {
        return bandb;
    }

    public void setBandb(BandB bandb) {
        this.bandb = bandb;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }
}
