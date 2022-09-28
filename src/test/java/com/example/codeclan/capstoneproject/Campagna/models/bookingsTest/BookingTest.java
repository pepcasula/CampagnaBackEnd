//package com.example.codeclan.capstoneproject.Campagna.accomodations.bookingsTest;
//
//import com.example.codeclan.capstoneproject.Campagna.accomodations.models.Booking;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//public class BookingTest {
//
//    LocalDate date;
//    LocalDate date1;
//    LocalDate date3;
//    LocalDate date4;
//    List<LocalDate> nearNewYearBooked;
//    LocalDate afterNewYear;
//    LocalDate newYear;
//    LocalDate newYearEve;
//    LocalDate newYearEveEve;
//    LocalDate testNewYear;
//    Booking booking;
//    Booking newYearBooking;
//    List<LocalDate> daysBooked;
//    LocalDate dayBooked1;
//    LocalDate dayBooked2;
//    LocalDate dayBooked3;
//    LocalDate dayBooked4;
//    LocalDate dayBooked5;
//    List<String> stringOne;
//    List<String> stringTwo;
//
//    @BeforeEach
//    public void before(){
//        booking = new Booking(2020, 1, 10, 5);
//        newYearBooking = new Booking(2020, 12, 30, 4);
//        daysBooked = new ArrayList<>();
//        dayBooked1 = LocalDate.of(2020, 1, 10);
//        dayBooked2 = LocalDate.of(2020, 1, 11);
//        dayBooked3 = LocalDate.of(2020, 1, 12);
//        dayBooked4 = LocalDate.of(2020, 1, 13);
//        dayBooked5 = LocalDate.of(2020, 1, 14);
//        daysBooked.add(dayBooked1);
//        daysBooked.add(dayBooked2);
//        daysBooked.add(dayBooked3);
//        daysBooked.add(dayBooked4);
//        daysBooked.add(dayBooked5);
//        date = LocalDate.of(2020, 10, booking.gettingToTheEndOfMonth(32, 10));
//        date1 = LocalDate.of(2022, 2, booking.gettingToTheEndOfMonth(29, 2));
//        date3 = LocalDate.of(2020, 12, 12);
//        date4 = LocalDate.of(2020, 12, 12);
//        newYearEveEve = LocalDate.of(2020, 12, 30);
//        newYearEve = LocalDate.of(2020, 12, 31);
//        newYear = LocalDate.of(2021, 1, 1);
//        afterNewYear = LocalDate.of(2021, 1, 2);
//        nearNewYearBooked = new ArrayList<>();
//        nearNewYearBooked.add(newYearEveEve);
//        nearNewYearBooked.add(newYearEve);
//        nearNewYearBooked.add(newYear);
//        nearNewYearBooked.add(afterNewYear);
//        testNewYear = booking.bookDate(2020, 12, 32);
//
//        stringOne = new ArrayList<>();
//        stringTwo = new ArrayList<>();
//        stringOne.add("Hello");
//        stringTwo.add("Hello");
//        stringTwo.add("World");
//        stringOne.add("World");
//    }
//
//    @Test
//    void whatDayIsIt() {
//        assertEquals(1, date.getDayOfMonth());
//    }
//
//    @Test
//    public void isItTheEndOfTheMonth(){
//        assertEquals(true, booking.isItTheEndOfMonth(32, 10));
//    }
//
//    @Test
//    public void AreTwoDatesSimilar(){
//        assertEquals(date3, date4);
//    }
//
//    @Test
//    public void isItNewYears(){
//        assertEquals(newYear, testNewYear);
//    }
//
//    @Test
//    public void doesBookingWork(){
//        assertArrayEquals(new List[]{daysBooked}, new List[]{booking.getDaysBooked()});
//    }
//
//    @Test
//    public void assertDeepEquals(){
//        assertArrayEquals(new List[]{stringOne}, new List[]{stringTwo});
//    }
//
//    @Test
//    public void checkNearNewYearWorks(){
//        assertArrayEquals(new List[]{nearNewYearBooked}, new List[]{newYearBooking.getDaysBooked()});
//    }
//}
