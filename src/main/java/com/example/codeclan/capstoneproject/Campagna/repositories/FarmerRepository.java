package com.example.codeclan.capstoneproject.Campagna.repositories;

import com.example.codeclan.capstoneproject.Campagna.models.products.FoodType;
import com.example.codeclan.capstoneproject.Campagna.models.user.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {

    Farmer findByFoodsId (Long foodId);

    Farmer findByFoodsFoodType (FoodType foodType);
}
