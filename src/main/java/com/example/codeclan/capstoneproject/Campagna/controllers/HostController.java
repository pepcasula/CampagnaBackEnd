package com.example.codeclan.capstoneproject.Campagna.controllers;

import com.example.codeclan.capstoneproject.Campagna.repositories.HostRepository;
import com.example.codeclan.capstoneproject.Campagna.user.Host;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HostController {

    @Autowired
    HostRepository hostRepository;

    @GetMapping(value = "/hosts")
    public ResponseEntity<List<Host>> getAllHosts(){
        return new ResponseEntity<>(hostRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/hosts")
    public ResponseEntity<Host> createHost(@RequestBody Host host){
        hostRepository.save(host);
        return new ResponseEntity<>(host, HttpStatus.CREATED);
    }
}
