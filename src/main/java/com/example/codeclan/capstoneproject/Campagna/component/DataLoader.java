package com.example.codeclan.capstoneproject.Campagna.component;

import com.example.codeclan.capstoneproject.Campagna.accomodations.models.*;
import com.example.codeclan.capstoneproject.Campagna.repositories.*;
import com.example.codeclan.capstoneproject.Campagna.user.Host;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.List;

@Component
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
        BAndB bAndB = new BAndB("That one", host);
        BAndBRoom bAndBRoom = new BAndBRoom("12", RoomType.TRIPLE, 100, bAndB);
        Booking possibleBooking = new Booking(2022, 8, 4, 3, bAndBRoom);
        DayBooked dayBooked1 = new DayBooked(possibleBooking, 2022, 8, 4);
        DayBooked dayBooked2 = new DayBooked(possibleBooking, 2022, 8, 5);
        DayBooked dayBooked3 = new DayBooked(possibleBooking, 2022, 8, 6);
        DayBooked dayBooked4 = new DayBooked(possibleBooking, 2022, 8, 7);
        hostRepository.save(host);
        bAndBRepository.save(bAndB);
        bAndBRoomRepository.save(bAndBRoom);
        bookingRepository.save(possibleBooking);
        dayBookedRepository.save(dayBooked1);
        dayBookedRepository.save(dayBooked2);
        dayBookedRepository.save(dayBooked3);
        dayBookedRepository.save(dayBooked4);
    }
}
