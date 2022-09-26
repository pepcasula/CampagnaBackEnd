package com.example.codeclan.capstoneproject.Campagna.accomodations.bookingsTest;

import com.example.codeclan.capstoneproject.Campagna.accomodations.models.*;
import com.example.codeclan.capstoneproject.Campagna.user.Host;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HostTest {

    Host host;
    BAndB bAndB;
    BAndBRoom bAndBRoom;
    Hotel hotel;
    HotelRoom hotelRoom;
    CampSite campSite;
    CampSitePitch campSitePitch;
    House house;
    List<LocalDate> daysBooked;
    LocalDate dayBooked1;
    LocalDate dayBooked2;
    LocalDate dayBooked3;
    LocalDate dayBooked4;
    LocalDate dayBooked5;


    @BeforeEach
    public void before(){
        host = new Host("Bob", "Has a B&B, hotel, campsite and house to rent out");
        bAndB = new BAndB("The Bear and Bee");
        campSite = new CampSite("The not just a field");
        hotel = new Hotel("Better than that B&B");
        house = new House("It's almost like being at home", 5, 100);
        bAndBRoom = new BAndBRoom("1", RoomType.DOUBLE, 30);
        hotelRoom = new HotelRoom("20", RoomType.FAMILY, 50);
        campSitePitch = new CampSitePitch("A place to sleep", 3, 10);
        bAndB.addRoom(bAndBRoom);
        hotel.addRoom(hotelRoom);
        campSite.addCampSitePitch(campSitePitch);
        host.addAccommodation(hotel);
        host.addAccommodation(house);
        host.addAccommodation(campSite);
        host.addAccommodation(bAndB);
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
        host.makeBooking(2020, 1, 10, 5, 2);
    }

    @Test
    public void HostCanMakeBooking(){
        assertEquals(daysBooked, host.getDaysBooked());
    }



}
