package com.example.codeclan.capstoneproject.Campagna.repositories;

import com.example.codeclan.capstoneproject.Campagna.products.Food;
import com.example.codeclan.capstoneproject.Campagna.products.FoodType;
import com.example.codeclan.capstoneproject.Campagna.user.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

    List<Food> findByFoodType(FoodType foodType);

    List<Food> findAllByFarmerId(Long farmerId);

}


