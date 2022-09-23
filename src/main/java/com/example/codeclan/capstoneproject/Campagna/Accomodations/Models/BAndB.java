package com.example.codeclan.capstoneproject.Campagna.Accomodations.Models;

import com.example.codeclan.capstoneproject.Campagna.Accomodation.Models.BAndBRoom;

import java.util.ArrayList;
import java.util.List;

public class BAndB extends Accommodation{

    private List<BAndBRoom> rooms;

    public BAndB(String name) {
        super(name);
        this.rooms = new ArrayList<>();
    }


}
