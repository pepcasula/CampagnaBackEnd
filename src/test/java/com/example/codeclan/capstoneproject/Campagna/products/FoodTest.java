package com.example.codeclan.capstoneproject.Campagna.products;

import com.example.codeclan.capstoneproject.Campagna.models.products.Food;
import com.example.codeclan.capstoneproject.Campagna.models.products.FoodType;
import com.example.codeclan.capstoneproject.Campagna.models.user.Farmer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodTest {

    Farmer farmer1;
    Farmer farmer2;
    Food food1;
    Food food2;

    @BeforeEach
    public void beforeEach(){

        farmer1 = new Farmer(
                "Nicholas Bigbelly",
                ""
        );
        farmer2 = new Farmer(
                "Jeremiah Lostsoul",
                ""
        );

        food1 = new Food(
                "Wild Thistle Honey",
                16,
                FoodType.HONEY,
                500,
                "A golden amber coloured, aromatic honey that slowly crystalises over time.",
                "../../honey01.png",
                farmer1
        );
        food2 = new Food(
                "Pantumas White Wine",
                28,
                FoodType.DRINK,
                70,
                "Pantumas has a light golden colour like onion skin, it is fruity, floral, fresh, mineral with a very persistent aftertaste.",
                "../../wine01.png",
                farmer2
        );
    }

    @Test
    public void canGetName(){
        assertEquals("Pantumas White Wine", food2.getName());
    }

    @Test
    public void canSetName(){
        food2.setName("Rose Wine");
        assertEquals("Rose Wine", food2.getName());
    }


    @Test
    public void canGetPrice(){
        assertEquals(16, food1.getPrice());
    }

    @Test
    public void canSetPrice(){
        food2.setPrice(20);
        assertEquals(20, food2.getPrice());
    }


    @Test
    public void canGetDescription(){
        assertEquals("A golden amber coloured, aromatic honey that slowly crystalises over time.", food1.getDescription());
    }

    @Test
    public void canSetDescription(){
        food1.setDescription("Pure Acacia honey that tastes like nectar.");
        assertEquals("Pure Acacia honey that tastes like nectar.", food1.getDescription());
    }

    @Test
    public void canGetFoodType(){
        assertEquals(FoodType.DRINK, food2.getFoodType());
    }

    @Test
    public void canSetType(){
        food2.setFoodType(FoodType.SWEET);
        assertEquals(FoodType.SWEET, food2.getFoodType());
    }

    @Test
    public void canGetSizePerUnit(){
        assertEquals(500, food1.getSizePerUnit());
    }

    @Test
    public void canSetSizePerUnit(){
        food1.setSizePerUnit(1000);
        assertEquals(1000, food1.getSizePerUnit());
    }

    @Test
    public void canPrintSizeInfo(){
        assertEquals("500g", food1.printSizeInfo());
    }

    @Test
    public void canGetFarmer(){
        assertEquals(farmer2, food2.getFarmer());
    }

    @Test
    public void canSetFarmer(){
        food2.setFarmer(farmer1);
        assertEquals(farmer1, food2.getFarmer());
    }

    @Test
    public void canGetMeasurementUnit(){
        assertEquals("g", food1.getMeasurementUnit());
    }

    @Test
    public void canGetImageUrl(){
        assertEquals("../../honey01.png", food1.getImageUrl());
    }

    @Test
    public void canSetImageUrl(){
        food2.setImageUrl("../../wine99.png");
        assertEquals("../../wine99.png", food2.getImageUrl());
    }
}

