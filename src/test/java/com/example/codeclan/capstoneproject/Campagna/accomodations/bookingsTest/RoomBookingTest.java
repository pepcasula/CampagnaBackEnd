package com.example.codeclan.capstoneproject.Campagna.accomodations.bookingsTest;

import com.example.codeclan.capstoneproject.Campagna.accomodations.models.HotelRoom;
import com.example.codeclan.capstoneproject.Campagna.accomodations.models.RoomType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomBookingTest {

    HotelRoom hotelRoom;
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
    public void before(){
        hotelRoom = new HotelRoom("1", RoomType.DOUBLE, 50);
        hotelRoom.makeBooking(2020, 1, 10, 5);
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
    public void roomCanMakeBooking(){
        assertEquals(daysBooked, hotelRoom.getBookedDays());
    }

    @Test
    public void roomHasOneBooking(){
        assertEquals(1, hotelRoom.getBookings().size());
    }

    @Test
    public void roomCanBookMoreThanOneStretch(){
        hotelRoom.makeBooking(2020, 12, 30, 4);
        assertEquals(overAllBooking, hotelRoom.getBookedDays());
    }

    @Test
    public void roomHasTwoBooking(){
        hotelRoom.makeBooking(2020, 12, 30, 4);
        assertEquals(2, hotelRoom.getBookings().size());
    }

    @Test
    public void roomDoesNotDoubleBook(){
        hotelRoom.makeBooking(2020, 12, 30, 4);
        hotelRoom.newBooking(2020, 12, 31, 3);
        assertEquals(overAllBooking, hotelRoom.getBookedDays());
    }

    @Test
    public void roomStillHasTwoBooking(){
        hotelRoom.makeBooking(2020, 12, 30, 4);
        hotelRoom.newBooking(2020, 12, 31, 3);
        assertEquals(2, hotelRoom.getBookings().size());
    }
}
