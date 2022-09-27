//package com.example.codeclan.capstoneproject.Campagna.controllers;
//
//import com.example.codeclan.capstoneproject.Campagna.accomodations.models.DayBooked;
//import com.example.codeclan.capstoneproject.Campagna.repositories.DayBookedRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@RestController
//public class DayBookedController {
//
//    @Autowired
//    DayBookedRepository dayBookedRepository;
//
//    @GetMapping(value = "/daysbooked")
//    public ResponseEntity<List<DayBooked>> getAllDayBooked(){
//        return new ResponseEntity<>(dayBookedRepository.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/daysbooked/availability")
//    public List<DayBooked> checkForDoubleBooking(@RequestParam(name = "date")LocalDate date){
//        return dayBookedRepository.getByDate(date);
//    }
//}
