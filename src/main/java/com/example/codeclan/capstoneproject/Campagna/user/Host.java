package com.example.codeclan.capstoneproject.Campagna.user;

import com.example.codeclan.capstoneproject.Campagna.accomodations.models.BAndB;
import com.example.codeclan.capstoneproject.Campagna.accomodations.models.DayBooked;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hosts")
public class Host{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String name;
    @Column
    private int wallet;
    @Column
    private String info;

//    @OneToMany(mappedBy = "host", fetch = FetchType.LAZY)
//    @JsonIgnoreProperties({"host"})
//    private List<Accommodation> accommodations;

    @OneToMany(mappedBy = "host")
    @JsonIgnoreProperties({"host"})
    private List<BAndB> bAndBs;

    public Host(String name, String info) {
        this.name = name;
        this.info = info;
        this.wallet = 0;
        this.bAndBs = new ArrayList<>();
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

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<BAndB> getbAndBs() {
        return bAndBs;
    }

    public void setbAndBs(List<BAndB> bAndBs) {
        this.bAndBs = bAndBs;
    }

    public void addAccommodation(BAndB b){
        this.bAndBs.add(b);
    }
        public void makeBooking(int year, int month, int day, int numberOfDays, int numberOfGuests){
        int numberOfGuestsNeedingToBeBooked = numberOfGuests;
        for(BAndB accommodation : this.bAndBs){
            if (accommodation.accommodationIsBigEnough(numberOfGuests)){
                while(numberOfGuestsNeedingToBeBooked > 0){
                    numberOfGuestsNeedingToBeBooked -= accommodation.makeBooking(year, month, day, numberOfDays, numberOfGuests);
                }
            }
        }
    }

    public List<LocalDate> getDaysBooked(){
        List<LocalDate> bookedDays = new ArrayList<>();
        for(BAndB accommodation : this.bAndBs){
            bookedDays.addAll(accommodation.getBookedDays());
        }
        return bookedDays;
    }

}
