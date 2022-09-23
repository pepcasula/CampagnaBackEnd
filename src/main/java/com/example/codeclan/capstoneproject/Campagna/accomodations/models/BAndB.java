package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import java.util.ArrayList;
import java.util.List;

public class BAndB extends Accommodation{

    private List<BAndBRoom> rooms;

    public BAndB(String name) {
        super(name);
        this.rooms = new ArrayList<>();
    }


}
