package com.example.codeclan.capstoneproject.Campagna.accomodations.models;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccomodationTest {

    BAndB bAndB;
    CampSite campSite;
    Hotel hotel;
    House house;
    BAndBRoom bAndBRoom;
    HotelRoom hotelRoom;
    CampSitePitch campSitePitch;


    @BeforeEach
    void setUp() {
        bAndB = new BAndB("The Bear and Bee");
        campSite = new CampSite("The not just a field");
        hotel = new Hotel("Better than that B&B");
        house = new House("It's almost like being at home", 5);
        bAndBRoom = new BAndBRoom("1", RoomType.DOUBLE, 30);
        hotelRoom = new HotelRoom("20", RoomType.FAMILY, 50);
        campSitePitch = new CampSitePitch("A place to sleep", 3, 10);
    }

    @Test
    public void bAndBHasName() {
        assertEquals("The Bear and Bee", bAndB.getName());
    }

    @Test
    public void campSitehasName(){
        assertEquals("The not just a field", campSite.getName());
    }

    @Test
    public void hotelHasName(){
        assertEquals("Better than that B&B", hotel.getName());
    }

    @Test
    public void houseHasName(){
        assertEquals("It's almost like being at home", house.getName());
    }

    @Test
    public void houseHasCapacity(){
        assertEquals(5, house.getCapacity());
    }

    @Test
    public void hotelStartsWithZero(){
        assertEquals(0, hotel.numberOfRooms());
    }
    @Test
    public void BandBStartsWithZero(){
        assertEquals(0, bAndB.numberOfRooms());
    }
    @Test
    public void campSiteStartsWithZero(){
        assertEquals(0, campSite.numberOfSites());
    }

    @Test
    public void campSiteCanAddSite(){
        campSite.addCampSitePitch(campSitePitch);
        assertEquals(1, campSite.numberOfSites());
    }

    @Test
    public void bandbCanAddRoom(){
        bAndB.addRoom(bAndBRoom);
        assertEquals(1, bAndB.numberOfRooms());
    }

    @Test
    public void hotelCanAddRoom(){
        hotel.addRoom(hotelRoom);
        assertEquals(1, hotel.numberOfRooms());
    }

    @Test
    public void canGetPriceFromRoom(){
        assertEquals(30, bAndB.getRoomPrice(bAndBRoom));
    }

    @Test
    public void canGetHotelRoomPrice(){
        assertEquals(50, hotel.getRoomPrice(hotelRoom));
    }

    @Test
    public void canGetCampSitePrice(){
        assertEquals(10, campSite.getSitePrice(campSitePitch));
    }
}
