package com.example.codeclan.capstoneproject.Campagna.accomodations.bookings;

import net.bytebuddy.asm.Advice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    private LocalDate startDate;
    private LocalDate endDate;
    private List<LocalDate> daysBooked;
    private int numberOfDays;

    public Booking(int year, int month, int day, int numberOfDays) {
        this.startDate = bookDate(year, month, day);
        this.daysBooked = new ArrayList<>();
        this.numberOfDays = numberOfDays;
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

    public List<LocalDate> getDaysBooked() {
        return daysBooked;
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

    public LocalDate bookDate(int year, int month, int day){
        int bookingDay = gettingToTheEndOfMonth(day, month);
        int bookingMonth = itIsTheEndOfMonth(day, month);
        int bookingYear = happyNewYear(day, month, year);
        LocalDate bookingDate = LocalDate.of(bookingYear, bookingMonth, bookingDay);
        return bookingDate;
    }

    public void setDaysBooked(int numberOfDays) {
        int firstDay = this.startDate.getDayOfMonth();
        int month = this.startDate.getMonthValue();
        int year = this.startDate.getYear();
//        daysBooked.add();
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
