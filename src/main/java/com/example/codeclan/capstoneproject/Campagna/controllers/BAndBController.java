package com.example.codeclan.capstoneproject.Campagna.controllers;

import com.example.codeclan.capstoneproject.Campagna.accomodations.models.BAndB;
import com.example.codeclan.capstoneproject.Campagna.repositories.BAndBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BAndBController {

    @Autowired
    BAndBRepository bAndBRepository;

    @GetMapping(value = "/bandbs")
    public ResponseEntity<List<BAndB>> getAllBAndBs(){
        return new ResponseEntity<>(bAndBRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/bandbs")
    public ResponseEntity<BAndB> createBAndB(@RequestBody BAndB bAndB){
        bAndBRepository.save(bAndB);
        return new ResponseEntity<>(bAndB, HttpStatus.CREATED);
    }
}
