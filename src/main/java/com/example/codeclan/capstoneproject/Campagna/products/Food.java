package com.example.codeclan.capstoneproject.Campagna.products;

import com.example.codeclan.capstoneproject.Campagna.user.Farmer;

public class Food extends Product{

    private FoodType foodType;
    private int sizePerUnit;
    private Farmer farmer;


    public Food(String name, int price, FoodType foodType, int sizePerUnit, String description, Farmer farmer) {
        super(name, price, description);
        this.foodType = foodType;
        this.sizePerUnit = sizePerUnit;
        this.farmer = farmer;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public int getSizePerUnit() {
        return sizePerUnit;
    }

    public void setSizePerUnit(int sizePerUnit) {
        this.sizePerUnit = sizePerUnit;
    }

    // printSizeInfo: This method returns a string with the full size info (i.e. 500g, or 70cl)
    public String printSizeInfo(){
        return String.valueOf(this.sizePerUnit) + this.foodType.getMeasureUnit();
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }
}
