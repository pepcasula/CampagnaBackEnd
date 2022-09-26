package com.example.codeclan.capstoneproject.Campagna.user;

import com.example.codeclan.capstoneproject.Campagna.products.Food;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "farmers")
public class Farmer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "wallet")
    private int wallet;

    @Column(name = "info")
    private String info;

    @OneToMany(mappedBy = "farmer")
    @JsonIgnoreProperties({"farmer"})
    private List<Food> foods;


    public Farmer(String name, String info) {
        this.name = name;
        this.wallet = 0;
        this.info = info;
        this.foods = new ArrayList<>();

    }

    public Farmer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void sell(int amount) {
        this.wallet += amount;
    }

    public void buy(int amount){
        this.wallet -= amount;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> products) {
        this.foods = products;
    }

    public int countFoods(){
        return this.foods.size();
    }

    public void clearFoods(){
        this.foods.clear();
    }
}
