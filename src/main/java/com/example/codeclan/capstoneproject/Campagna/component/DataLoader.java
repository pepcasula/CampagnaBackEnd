package com.example.codeclan.capstoneproject.Campagna.component;

import com.example.codeclan.capstoneproject.Campagna.accomodations.bookings.BandB;
import com.example.codeclan.capstoneproject.Campagna.accomodations.bookings.Booking;
import com.example.codeclan.capstoneproject.Campagna.repositories.BandBRepository;
import com.example.codeclan.capstoneproject.Campagna.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BandBRepository bandBRepository;
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args){
        BandB bandB = new BandB("The Bee and Bear", "B&B@BeeBear.com");
        Booking booking = new Booking(bandB, LocalDate.of(2022, 5, 20), LocalDate.of(2022, 5, 3), 2);
        bandBRepository.save(bandB);
        bookingRepository.save(booking);
    }
}
