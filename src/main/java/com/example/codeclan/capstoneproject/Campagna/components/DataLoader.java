package com.example.codeclan.capstoneproject.Campagna.components;

import com.example.codeclan.capstoneproject.Campagna.products.Food;
import com.example.codeclan.capstoneproject.Campagna.products.FoodType;
import com.example.codeclan.capstoneproject.Campagna.repositories.FarmerRepository;
import com.example.codeclan.capstoneproject.Campagna.repositories.FoodRepository;
import com.example.codeclan.capstoneproject.Campagna.user.Farmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FarmerRepository farmerRepository;
    @Autowired
    FoodRepository foodRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) {

        Farmer farmer1 = new Farmer(
                "Nicholas Bigbelly",
                "The Bigbelly family has been producing honey and wine for several generations..."
        );
        farmerRepository.save(farmer1);

        Farmer farmer2 = new Farmer(
                "Jeremiah Lostsoul",
                "Lostsoul properties include vineyards, wheat crops and cattle farms."
        );
        farmerRepository.save(farmer2);


        Farmer farmer3 = new Farmer(
                "Thomas Longhand",
                "At the Longhand farms you will find all the best meat and milk from the region, and genuine fresh cheese."
        );
        farmerRepository.save(farmer3);

        Food food1 = new Food(
                "Wild Thistle Honey",
                19,
                FoodType.HONEY,
                500,
                "A golden amber coloured, aromatic honey that slowly crystalises over time.",
                farmer1
        );
        foodRepository.save(food1);

        Food food2 = new Food(
                "Pantumas White Wine",
                28,
                FoodType.DRINK,
                70,
                "Pantumas has a light golden colour like onion skin, it is fruity, floral, fresh, mineral with a very persistent aftertaste.",
                farmer1
        );
        foodRepository.save(food2);

        Food food3 = new Food(
                "Homemade Wheat Bran Sourdough Bread",
                7,
                FoodType.BAKERY,
                450,
                "Super rich in flavor, this traditional homemade bread is plenty of healthy fiber and vitamins.",
                farmer2
        );
        foodRepository.save(food3);

        Food food4 = new Food(
                "Extra Virgin Unfiltered Olive Oil",
                14,
                FoodType.OIL,
                500,
                "Like fresh juice, this unfiltered extra-virgin olive oil retains a light olive pulp, offering a fuller palette of taste notes.",
                farmer2
        );
        foodRepository.save(food4);
    }
}