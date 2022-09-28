package com.example.codeclan.capstoneproject.Campagna.controllers;
import com.example.codeclan.capstoneproject.Campagna.products.Food;
import com.example.codeclan.capstoneproject.Campagna.products.FoodType;
import com.example.codeclan.capstoneproject.Campagna.repositories.FarmerRepository;
import com.example.codeclan.capstoneproject.Campagna.user.Farmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FarmerController {

    @Autowired
    FarmerRepository farmerRepository;

    @GetMapping(value = "/farmers")
    public ResponseEntity <List<Farmer>> getAllFarmers(){
        return new ResponseEntity<>(farmerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/farmers/{id}")
    public ResponseEntity<Farmer> getFarmerById(@PathVariable Long id) {
        return new ResponseEntity(farmerRepository.findById(id), HttpStatus.OK);
    }


    @PostMapping("/farmers")
    public ResponseEntity<Farmer> postFarmer(@RequestBody Farmer farmer){
        farmerRepository.save(farmer);
        return new ResponseEntity<>(farmer, HttpStatus.CREATED);
    }

    @DeleteMapping(value="/farmers/{id}")
    public ResponseEntity<Long> deleteFarmer(@PathVariable Long id){
        farmerRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @GetMapping(value = "/farmers/food_id")
    public ResponseEntity<Farmer> getFarmerByFoodsId(@RequestParam(value = "food_id") Long foodId){
        return new ResponseEntity<>(farmerRepository.findByFoodsId(foodId), HttpStatus.OK);
    }

    @GetMapping(value = "/farmers/food_type")
    public ResponseEntity<Farmer> getFarmerByFoodsFoodType(@RequestParam(value = "food_type") FoodType foodType){
        return new ResponseEntity<>(farmerRepository.findByFoodsFoodType(foodType), HttpStatus.OK);
    }

}
