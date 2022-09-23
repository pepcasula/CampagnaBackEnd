package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BAndBRoomTest {

    BAndBRoom bAndBRoom1;
    BAndBRoom bAndBRoom2;

    @BeforeEach
    public void before(){
        bAndBRoom1 = new BAndBRoom("Mount Bighorn room", RoomType.DOUBLE, 40);
        bAndBRoom2 = new BAndBRoom("Green Valley room", RoomType.SINGLE, 25);
    }

    @Test
    public void canGetName(){
        assertEquals("Mount Bighorn room", bAndBRoom1.getName());
    }

    @Test
    public void canSetName(){
        bAndBRoom2.setName("Golden Suite");
        assertEquals("Golden Suite", bAndBRoom2.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bAndBRoom1.getRoomTypeCapacity());
    }

    @Test
    public void canGetPrice(){
        assertEquals(40, bAndBRoom1.getPrice());
    }

    @Test
    public void canSetPrice(){
        bAndBRoom2.setPrice(65);
        assertEquals(65, bAndBRoom2.getPrice());
    }
}
