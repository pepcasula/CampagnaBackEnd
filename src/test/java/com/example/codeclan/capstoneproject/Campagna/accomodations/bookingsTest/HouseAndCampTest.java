package com.example.codeclan.capstoneproject.Campagna.accomodations.bookingsTest;

import com.example.codeclan.capstoneproject.Campagna.accomodations.models.CampSitePitch;
import com.example.codeclan.capstoneproject.Campagna.accomodations.models.House;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseAndCampTest {

    House house;
    CampSitePitch campSitePitch;
    List<LocalDate> daysBooked;
    LocalDate dayBooked1;
    LocalDate dayBooked2;
    LocalDate dayBooked3;
    LocalDate dayBooked4;
    LocalDate dayBooked5;
    List<LocalDate> overAllBooking;
    LocalDate afterNewYear;
    LocalDate newYear;
    LocalDate newYearEve;
    LocalDate newYearEveEve;

    @BeforeEach
    public void before() {
        house = new House("House", 7, 100);
        campSitePitch = new CampSitePitch("A2", 3, 30);
        house.makeBooking(2020, 1, 10, 5);
        campSitePitch.makeBooking(2020, 1, 10, 5);
        daysBooked = new ArrayList<>();
        dayBooked1 = LocalDate.of(2020, 1, 10);
        dayBooked2 = LocalDate.of(2020, 1, 11);
        dayBooked3 = LocalDate.of(2020, 1, 12);
        dayBooked4 = LocalDate.of(2020, 1, 13);
        dayBooked5 = LocalDate.of(2020, 1, 14);
        daysBooked.add(dayBooked1);
        daysBooked.add(dayBooked2);
        daysBooked.add(dayBooked3);
        daysBooked.add(dayBooked4);
        daysBooked.add(dayBooked5);
        newYearEveEve = LocalDate.of(2020, 12, 30);
        newYearEve = LocalDate.of(2020, 12, 31);
        newYear = LocalDate.of(2021, 1, 1);
        afterNewYear = LocalDate.of(2021, 1, 2);
        overAllBooking = new ArrayList<>();
        overAllBooking.add(dayBooked1);
        overAllBooking.add(dayBooked2);
        overAllBooking.add(dayBooked3);
        overAllBooking.add(dayBooked4);
        overAllBooking.add(dayBooked5);
        overAllBooking.add(newYearEveEve);
        overAllBooking.add(newYearEve);
        overAllBooking.add(newYear);
        overAllBooking.add(afterNewYear);
    }

    @Test
    public void houseHasBooking(){
        assertEquals(daysBooked, house.getBookedDays());
    }

    @Test
    public void campSiteHasBooking(){
        assertEquals(daysBooked, campSitePitch.getBookedDays());
    }

    @Test
    public void houseDoesNotDoubleBook(){
        house.makeBooking(2020, 12, 30, 4);
        house.newBooking(2020, 12, 31, 3);
        assertEquals(overAllBooking, house.getBookedDays());
    }
    @Test
    public void campSiteDoesNotDoubleBook(){
        campSitePitch.makeBooking(2020, 12, 30, 4);
        campSitePitch.newBooking(2020, 12, 31, 3);
        assertEquals(overAllBooking, campSitePitch.getBookedDays());
    }

}
