package com.example.codeclan.capstoneproject.Campagna.accomodations.bookingsTest;

import com.example.codeclan.capstoneproject.Campagna.accomodations.bookings.Booking;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class BookingTest {

    LocalDate date;
    LocalDate date1;
    LocalDate date3;
    LocalDate date4;
    LocalDate newYear;
    LocalDate testNewYear;
    Booking booking;

    @BeforeEach
    public void before(){
        booking = new Booking(2020, 1, 10, 5);
        date = LocalDate.of(2020, 10, booking.gettingToTheEndOfMonth(32, 10));
        date1 = LocalDate.of(2022, 2, booking.gettingToTheEndOfMonth(29, 2));
        date3 = LocalDate.of(2020, 12, 12);
        date4 = LocalDate.of(2020, 12, 12);
        newYear = LocalDate.of(2021, 1, 1);
        testNewYear = booking.bookDate(2020, 12, 32);
    }

    @Test
    void whatDayIsIt() {
        assertEquals(1, date.getDayOfMonth());
    }

    @Test
    public void isItTheEndOfTheMonth(){
        assertEquals(true, booking.isItTheEndOfMonth(32, 10));
    }

    @Test
    public void AreTwoDatesSimilar(){
        assertEquals(date3, date4);
    }

    @Test
    public void isItNewYears(){
        assertEquals(newYear, testNewYear);
    }
}
