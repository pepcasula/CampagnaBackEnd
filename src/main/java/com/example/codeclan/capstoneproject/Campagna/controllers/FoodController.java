package com.example.codeclan.capstoneproject.Campagna.controllers;
import com.example.codeclan.capstoneproject.Campagna.products.Food;
import com.example.codeclan.capstoneproject.Campagna.products.FoodType;
import com.example.codeclan.capstoneproject.Campagna.repositories.FarmerRepository;
import com.example.codeclan.capstoneproject.Campagna.repositories.FoodRepository;
import com.example.codeclan.capstoneproject.Campagna.user.Farmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {

    @Autowired
    FoodRepository foodRepository;

    @Autowired
    FarmerRepository farmerRepository;

    @GetMapping(value = "/foods")
    public ResponseEntity <List<Food>> getAllFoods(){
        return new ResponseEntity<>(foodRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/foods/foodtype")
    public ResponseEntity <List<Food>> getFoodByType(@RequestParam (name = "foodtype") FoodType foodType){
        return new ResponseEntity(foodRepository.findByFoodType(foodType), HttpStatus.OK);
    }

    @GetMapping(value="/foods/{id}")
    public ResponseEntity<Food> getFoodById(@PathVariable Long id) {
        return new ResponseEntity(foodRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/foods")
    public ResponseEntity<Food> postFood(@RequestBody Food food){
        foodRepository.save(food);
        return new ResponseEntity<>(food, HttpStatus.CREATED);
    }

    @DeleteMapping(value="/foods/{id}")
    public ResponseEntity<Long> deleteFood(@PathVariable Long id){
        foodRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @GetMapping(value = "/foods/farmer_id")
    public ResponseEntity<List<Food>> getFoodsByFarmerId(@RequestParam (name = "farmer_id") Long farmerId){
        return new ResponseEntity<>(foodRepository.findAllByFarmerId(farmerId), HttpStatus.OK);
    }

}