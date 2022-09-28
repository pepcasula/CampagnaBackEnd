//package com.example.codeclan.capstoneproject.Campagna.accomodations;
//
//import com.example.codeclan.capstoneproject.Campagna.accomodations.models.*;
//import com.example.codeclan.capstoneproject.Campagna.user.Host;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class HostTest {
//
//    Host host;
//    BAndB bAndB;
//    BAndBRoom bAndBRoom;
//    Hotel hotel;
//    HotelRoom hotelRoom;
//    CampSite campSite;
//    CampSitePitch campSitePitch;
//    House house;
//
//    @BeforeEach
//    public void before(){
//        host = new Host("Bob", "Has a B&B, hotel, campsite and house to rent out");
//        bAndB = new BAndB("The Bear and Bee", host);
//        campSite = new CampSite("The not just a field", host);
//        hotel = new Hotel("Better than that B&B", host);
//        house = new House("It's almost like being at home", 5, 100, host);
//        bAndBRoom = new BAndBRoom("1", RoomType.DOUBLE, 30, bAndB);
//        hotelRoom = new HotelRoom("20", RoomType.FAMILY, 50, hotel);
//        campSitePitch = new CampSitePitch("A place to sleep", 3, 10, campSite);
//        bAndB.addRoom(bAndBRoom);
//        hotel.addRoom(hotelRoom);
//        campSite.addCampSitePitch(campSitePitch);
//        host.addAccommodation(hotel);
//        host.addAccommodation(house);
//        host.addAccommodation(campSite);
//        host.addAccommodation(bAndB);
//    }
//
//    @Test
//    public void hostHasName(){
//        assertEquals("Bob", host.getName());
//    }
//
//    @Test
//    public void hostHasInfo(){
//        assertEquals("Has a B&B, hotel, campsite and house to rent out", host.getInfo());
//    }
//
//    @Test
//    public void hostHasNoMoneyInWallet(){
//        assertEquals(0, host.getWallet());
//    }
//
//    @Test
//    public void hostHasFourAccommodations(){
//        assertEquals(4, host.getNumberOfAccommodations());
//    }
//}
