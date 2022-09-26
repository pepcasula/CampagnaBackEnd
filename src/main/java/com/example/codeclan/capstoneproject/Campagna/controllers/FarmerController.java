package com.example.codeclan.capstoneproject.Campagna.controllers;
import com.example.codeclan.capstoneproject.Campagna.repositories.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarmerController {

    @Autowired
    FarmerRepository farmerRepository;

}
