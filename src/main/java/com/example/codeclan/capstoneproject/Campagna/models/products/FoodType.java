package com.example.codeclan.capstoneproject.Campagna.models.products;

public enum FoodType {
    VEGETABLE("g"),
    DRINK("Cl"),
    OIL("Cl"),
    MEAT("g"),
    CHEESE("g"),
    MILK("Cl"),
    SWEET("g"),
    HONEY("g"),
    BAKERY("g");

    // measureUnit value = food.sizePerUnit measure system
    private final String measureUnit;

    FoodType(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }
}

