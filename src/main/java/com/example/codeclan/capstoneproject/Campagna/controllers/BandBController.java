package com.example.codeclan.capstoneproject.Campagna.controllers;

import com.example.codeclan.capstoneproject.Campagna.models.bookings.BandB;
import com.example.codeclan.capstoneproject.Campagna.repositories.BandBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BandBController {

    @Autowired
    BandBRepository bAndBRepository;

    @GetMapping(value = "/bandbs")
    public ResponseEntity<List<BandB>> getAllBAndBs(){
        return new ResponseEntity<>(bAndBRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/bandbs/{id}")
    public ResponseEntity<Optional<BandB>> getBandBById(@PathVariable Long id){
        return new ResponseEntity<>(bAndBRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/bandbs")
    public ResponseEntity<BandB> createBAndB(@RequestBody BandB bAndB){
        bAndBRepository.save(bAndB);
        return new ResponseEntity<>(bAndB, HttpStatus.CREATED);
    }
}
