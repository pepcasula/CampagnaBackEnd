package com.example.codeclan.capstoneproject.Campagna.user;

import com.example.codeclan.capstoneproject.Campagna.products.Food;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends User{

    private List<Food> farmerStock;

    public Farmer(String name, String info) {
        super(name, info);
        this.farmerStock = new ArrayList<>();
    }

    public List<Food> getStock() {
        return farmerStock;
    }

    public void setStock(List<Food> products) {
        this.farmerStock = products;
    }

    public int countStock(){
        return this.farmerStock.size();
    }

    public void clearStock(){
        this.farmerStock.clear();
    }
}
