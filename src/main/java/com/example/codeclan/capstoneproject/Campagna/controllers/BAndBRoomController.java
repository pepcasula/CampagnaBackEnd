package com.example.codeclan.capstoneproject.Campagna.controllers;

import com.example.codeclan.capstoneproject.Campagna.accomodations.models.BAndB;
import com.example.codeclan.capstoneproject.Campagna.accomodations.models.BAndBRoom;
import com.example.codeclan.capstoneproject.Campagna.accomodations.models.RoomType;
import com.example.codeclan.capstoneproject.Campagna.repositories.BAndBRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BAndBRoomController {

    @Autowired
    BAndBRoomRepository bAndBRoomRepository;

    @GetMapping(value = "/bandbrooms")
    public ResponseEntity<List<BAndBRoom>> getAllBAndBRooms(){
        return new ResponseEntity<>(bAndBRoomRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/bandbrooms/roomtype")
    public ResponseEntity<List<BAndBRoom>> getBAndBRoomByRoomType(@RequestParam(name = "roomtype")RoomType roomType){
        return new ResponseEntity<>(bAndBRoomRepository.findByRoomType(roomType), HttpStatus.OK);
    }

    @PostMapping(value = "/bandbrooms")
    public ResponseEntity<BAndBRoom> createBAndBRooms(@RequestBody BAndBRoom bAndBRoom){
        bAndBRoomRepository.save(bAndBRoom);
        return new ResponseEntity<>(bAndBRoom, HttpStatus.CREATED);
    }
}
