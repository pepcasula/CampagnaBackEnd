package com.example.codeclan.capstoneproject.Campagna.repositories;

import com.example.codeclan.capstoneproject.Campagna.products.Food;
import com.example.codeclan.capstoneproject.Campagna.products.FoodType;
import com.example.codeclan.capstoneproject.Campagna.user.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {

    Farmer findByFoodsId (Long foodId);

    Farmer findByFoodsFoodType (FoodType foodType);
}
