package com.example.codeclan.capstoneproject.Campagna.users;

import com.example.codeclan.capstoneproject.Campagna.products.Food;
import com.example.codeclan.capstoneproject.Campagna.products.FoodType;
import com.example.codeclan.capstoneproject.Campagna.user.Farmer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmerTest {

    Farmer farmer1;
    Farmer farmer2;
    Food food1;
    Food food2;
    Food food3;
    Food food4;
    List<Food> farmerStock1;
    List<Food> farmerStock2;


    @BeforeEach
    public void beforeEach(){

        farmer1 = new Farmer(
                "Nicholas Bigbelly",
                "The Bigbelly family has been producing honey and wine for several generations..."
        );
        farmer2 = new Farmer(
                "Jeremiah Lostsoul",
                "Lostsoul properties include vineyards, wheat crops and cattle farms."
        );

        food1 = new Food(
                "Wild Thistle Honey",
                19,
                FoodType.HONEY,
                500,
                "A golden amber coloured, aromatic honey that slowly crystalises over time.",
                farmer1
        );
        food2 = new Food(
                "Pantumas White Wine",
                28,
                FoodType.DRINK,
                70,
                "Pantumas has a light golden colour like onion skin, it is fruity, floral, fresh, mineral with a very persistent aftertaste.",
                farmer1
        );
        food3 = new Food(
                "Homemade Wheat Bran Sourdough Bread",
                7,
                FoodType.BAKERY,
                450,
                "Super rich in flavor, this traditional homemade bread is plenty of healthy fiber and vitamins.",
                farmer2
        );
        food4 = new Food(
                "Extra Virgin Unfiltered Olive Oil",
                14,
                FoodType.OIL,
                500,
                "Like fresh juice, this unfiltered extra-virgin olive oil retains a light olive pulp, offering a fuller palette of taste notes.",
                farmer2
        );

        farmerStock1 = new ArrayList<>();
        farmerStock2 = new ArrayList<>();

        farmerStock1.add(food1);
        farmerStock1.add(food2);
        farmerStock2.add(food3);
        farmerStock2.add(food4);

    }

    @Test
    public void canGetName(){
        assertEquals("Nicholas Bigbelly", farmer1.getName());
    }

    @Test
    public void canSetName(){
        farmer1.setName("Bernard Hunter");
        assertEquals("Bernard Hunter", farmer1.getName());
    }

    @Test
    public void hasEmptyWallet(){
        assertEquals(0, farmer2.getWallet());
    }

    @Test
    public void canSetAndGetWallet(){
        farmer2.setWallet(2000);
        assertEquals(2000, farmer2.getWallet());
    }

    @Test
    public void canBuy(){
        farmer1.setWallet(1000);
        farmer1.buy(320);
        assertEquals(680, farmer1.getWallet());
    }

    @Test
    public void canSell(){
        farmer2.sell(180);
        assertEquals(180, farmer2.getWallet());
    }

    @Test
    public void canGetInfo(){

    }

    @Test
    public void canSetInfo(){
        farmer2.setInfo("What about Lostsoul products?");
        assertEquals("What about Lostsoul products?", farmer2.getInfo());
    }

    @Test
    public void canSetAndGetStock(){
        farmer1.setStock(farmerStock1);
        assertEquals(farmerStock1, farmer1.getStock());
    }

    @Test
    public void canCountStock(){
        assertEquals(0, farmer2.countStock());
    }

    @Test
    public void canClearStock(){
        farmer2.setStock(farmerStock2);
        assertEquals(2, farmer2.countStock());
        farmer2.clearStock();
        assertEquals(0, farmer2.countStock());
    }
}

