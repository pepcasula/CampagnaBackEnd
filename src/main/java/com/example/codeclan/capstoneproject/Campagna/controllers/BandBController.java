package com.example.codeclan.capstoneproject.Campagna.controllers;

import com.example.codeclan.capstoneproject.Campagna.accomodations.bookings.BandB;
import com.example.codeclan.capstoneproject.Campagna.repositories.BandBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BandBController {

    @Autowired
    BandBRepository bAndBRepository;

    @GetMapping(value = "/bandbs")
    public ResponseEntity<List<BandB>> getAllBAndBs(){
        return new ResponseEntity<>(bAndBRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/bandbs")
    public ResponseEntity<BandB> createBAndB(@RequestBody BandB bAndB){
        bAndBRepository.save(bAndB);
        return new ResponseEntity<>(bAndB, HttpStatus.CREATED);
    }
}
