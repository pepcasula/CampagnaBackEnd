package com.example.codeclan.capstoneproject.Campagna.repositories;

import com.example.codeclan.capstoneproject.Campagna.models.products.Food;
import com.example.codeclan.capstoneproject.Campagna.models.products.FoodType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

    List<Food> findByFoodType(FoodType foodType);

    List<Food> findAllByFarmerId(Long farmerId);

}


