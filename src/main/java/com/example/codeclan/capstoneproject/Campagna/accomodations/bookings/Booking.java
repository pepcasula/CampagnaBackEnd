package com.example.codeclan.capstoneproject.Campagna.accomodations.bookings;

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
    private Boolean aBoolean;

    public Booking(BandB bandb, LocalDate startDate, LocalDate endDate) {
        this.bandb = bandb;
        this.startDate = startDate;
        this.endDate = endDate;
        this.aBoolean = false;
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

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }
}
