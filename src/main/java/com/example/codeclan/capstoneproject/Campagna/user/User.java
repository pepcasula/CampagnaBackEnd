package com.example.codeclan.capstoneproject.Campagna.user;

public abstract class User {

    private String name;
    private int wallet;
    private String info;

    public User(String name, String info) {
        this.name = name;
        this.info = info;
        this.wallet = 0;
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
}
