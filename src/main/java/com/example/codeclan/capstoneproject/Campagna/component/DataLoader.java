package com.example.codeclan.capstoneproject.Campagna.component;

import com.example.codeclan.capstoneproject.Campagna.accomodations.models.*;
import com.example.codeclan.capstoneproject.Campagna.repositories.*;
import com.example.codeclan.capstoneproject.Campagna.user.Host;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    HostRepository hostRepository;
    @Autowired
    BAndBRepository bAndBRepository;
    @Autowired
    BAndBRoomRepository bAndBRoomRepository;
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    DayBookedRepository dayBookedRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args){
        Host host = new Host("Bobbie", "Has a B&B, hotel, campsite and house to rent out");
        BAndB bAndB = new BAndB("Aa", host);
        BAndBRoom bAndBRoom = new BAndBRoom("12", RoomType.DOUBLE, 100, bAndB);
        host.makeBooking(2022, 10, 4, 3, 2);
        hostRepository.save(host);
        bAndBRepository.save(bAndB);
        bAndBRoomRepository.save(bAndBRoom);
    }
}
