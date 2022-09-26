package com.example.codeclan.capstoneproject.Campagna.component;

import com.example.codeclan.capstoneproject.Campagna.repositories.BookingRepository;
import com.example.codeclan.capstoneproject.Campagna.repositories.HostRepository;
import com.example.codeclan.capstoneproject.Campagna.repositories.HotelRepository;
import com.example.codeclan.capstoneproject.Campagna.repositories.HotelRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    HostRepository hostRepository;
    @Autowired
    HotelRepository hotelRepository;
    @Autowired
    HotelRoomRepository hotelRoomRepository;
    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args){

    }
}
