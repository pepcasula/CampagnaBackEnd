package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotelRoomTest {

    HotelRoom hotelRoom1;
    HotelRoom hotelRoom2;

    @BeforeEach
    public void before(){
        hotelRoom1 = new HotelRoom("Room 1", RoomType.TRIPLE, 55);
        hotelRoom2 = new HotelRoom("Room 2", RoomType.FAMILY, 70);
    }

    @Test
    public void canGetName(){
        assertEquals("Room 1", hotelRoom1.getName());
    }

    @Test
    public void canSetName(){
        hotelRoom2.setName("Family Suite");
        assertEquals("Family Suite", hotelRoom2.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals("Room 1", hotelRoom1.getName());
    }

    @Test
    public void canGetPrice(){
        assertEquals(55, hotelRoom1.getPrice());
    }

    @Test
    public void canSetPrice(){
        hotelRoom2.setPrice(95);
        assertEquals(95, hotelRoom2.getPrice());
    }
}
