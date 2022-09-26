package com.example.codeclan.capstoneproject.Campagna.controllers;
import com.example.codeclan.capstoneproject.Campagna.products.Food;
import com.example.codeclan.capstoneproject.Campagna.products.FoodType;
import com.example.codeclan.capstoneproject.Campagna.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {

    @Autowired
    FoodRepository foodRepository;

    @GetMapping(value = "/foods")
    public ResponseEntity <List<Food>> getAllFoods(){
        return new ResponseEntity<>(foodRepository.findAll(), HttpStatus.OK);
    }

}