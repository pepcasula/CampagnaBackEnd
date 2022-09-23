package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CampSitePitchTest {

    CampSitePitch campSitePitch1;
    CampSitePitch campSitePitch2;

    @BeforeEach
    public void before(){
        campSitePitch1 = new CampSitePitch("Pitch 1", 4, 15);
        campSitePitch2 = new CampSitePitch("Pitch 2", 2, 10);
    }

    @Test
    public void canGetName(){
        assertEquals("Pitch 1", campSitePitch1.getName());
    }

    @Test
    public void canSetName(){
        campSitePitch2.setName("Lake Front");
        assertEquals("Lake Front", campSitePitch2.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(4, campSitePitch1.getCapacity());
    }

    @Test
    public void canSetCapacity(){
        campSitePitch2.setCapacity(3);
        assertEquals(3, campSitePitch2.getCapacity());
    }

    @Test
    public void canGetPrice(){
        assertEquals(15, campSitePitch1.getPrice());
    }

    @Test
    public void canSetPrice(){
        campSitePitch2.setPrice(20);
        assertEquals(20, campSitePitch2.getPrice());
    }


}
