package com.example.codeclan.capstoneproject.Campagna.models.bookingsTest;

import com.example.codeclan.capstoneproject.Campagna.models.bookings.BandB;
import com.example.codeclan.capstoneproject.Campagna.models.bookings.Booking;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookingTest {

    BandB b;
    Booking booking;

    @BeforeEach
    public void before(){
        b  = new BandB("Bee", "&@B.com", "7");
        booking  = new Booking(b, LocalDate.of(2022, 5, 5), LocalDate.of(2022, 5, 6), 6);
    }

    @Test
    public void hasStatus(){
        assertEquals(false, booking.isStatus());
    }

    @Test
    public void canChangeStatus(){
        booking.setStatus(true);
        assertEquals(true, booking.isStatus());
    }
}