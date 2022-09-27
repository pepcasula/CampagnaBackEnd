package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import com.example.codeclan.capstoneproject.Campagna.repositories.BookingRepository;
import com.example.codeclan.capstoneproject.Campagna.repositories.DayBookedRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private LocalDate startDate;
    @OneToMany(mappedBy = "booking", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"booking"})
    private List<DayBooked> daysBooked;
    @Column
    private int numberOfDays;
    @ManyToOne
    @JsonIgnoreProperties({"booking"})
    @JoinColumn(name = "bandbRoom_id", nullable = false)
    private BAndBRoom bandbRoom;

    public Booking() {
    }

    public Booking(int year, int month, int day, int numberOfDays, BAndBRoom bandbRoom) {
        this.startDate = LocalDate.of(year, month, day);
        this.daysBooked = setDaysBooked(numberOfDays);
        this.numberOfDays = numberOfDays;
        this.bandbRoom = bandbRoom;
    }

    public void setDaysBooked(List<DayBooked> daysBooked) {
        this.daysBooked = daysBooked;
    }

    public void makeDayBooked(int year, int month, int day, int numberOfDays){
        for(int i = 0; i < numberOfDays; i++){
            DayBooked dayBooked = new DayBooked(this, year, month, day);
            daysBooked.add(dayBooked);
        }
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

    public BAndBRoom getBandbRoom() {
        return bandbRoom;
    }

    public void setBandbRoom(BAndBRoom bandbRoom) {
        this.bandbRoom = bandbRoom;
    }

    public List<LocalDate> getDaysBooked() {
        List<LocalDate> daysThatHaveBeenBooked = new ArrayList<>();
        for(int i = 0; i < daysBooked.size(); i++){
            int year = this.daysBooked.get(i).getYear();
            int month = this.daysBooked.get(i).getMonthValue();
            int day = this.daysBooked.get(i).getDayOfMonth();
            daysThatHaveBeenBooked.add(LocalDate.of(year, month, day));
        }
        return daysThatHaveBeenBooked;
    }

    public List<DayBooked> getDaysBookedToBeSaved() {
        return this.daysBooked;
    }

    public boolean isItTheLastDayOfFeb(int day, int month){
        if(month == 2){
            if(day > 28){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean isItTheLastDayOfAJSN(int day, int month){
        if (month == 4 || month == 6 || month == 9 || month == 11){
            if(day > 30){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean isItTheLastDayOfJMMJAOD(int day){
        if(day > 31){
            return true;
        } else {
            return false;
        }
    }

    public int gettingToTheEndOfMonth(int day, int month){
        if(isItTheLastDayOfFeb(day, month)){
            return day - 28;
        } else if(isItTheLastDayOfAJSN(day, month)){
            return day - 30;
        } else if (isItTheLastDayOfJMMJAOD(day)) {
            return day - 31;
        } else {
            return day;
        }
    }

    public boolean isItTheEndOfMonth(int day, int month){
        if(isItTheLastDayOfFeb(day, month)){
            return true;
        } else if(isItTheLastDayOfAJSN(day, month)){
            return true;
        } else if (isItTheLastDayOfJMMJAOD(day)) {
            return true;
        } else {
            return false;
        }
    }

    public int itIsTheEndOfMonth(int day, int month){
        if(isItTheEndOfMonth(day, month)){
            if(month == 12){
                return 1;
            }
            return month + 1;
        } else {
            return month;
        }
    }

    public boolean isItTheEndOfYear(int day, int month){
        if(isItTheEndOfMonth(day, month)){
            if(month == 12){
                return true;
            }
        }
        return false;
    }

    public int happyNewYear(int day, int month, int year){
        if(isItTheEndOfMonth(day, month)){
            return year + 1;
        } else {
            return year;
        }

    }

    public DayBooked bookDate(int year, int month, int day){
        int bookingDay = gettingToTheEndOfMonth(day, month);
        int bookingMonth = itIsTheEndOfMonth(day, month);
        int bookingYear = happyNewYear(day, month, year);
        DayBooked bookingDate = new DayBooked(this, bookingYear, bookingMonth, bookingDay);
        return bookingDate;
    }

    public ArrayList<DayBooked> setDaysBooked(int numberOfDays) {
        int firstDay = this.startDate.getDayOfMonth();
        int month = this.startDate.getMonthValue();
        int year = this.startDate.getYear();
        ArrayList<DayBooked> daysToBook = new ArrayList<>();
        for(int i = 0; i < numberOfDays; i++){
            daysToBook.add(bookDate(year, month, firstDay + i));
        }
        return daysToBook;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
