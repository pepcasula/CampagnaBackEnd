package com.example.codeclan.capstoneproject.Campagna.accomodations.models;

import java.util.ArrayList;
import java.util.List;

public class CampSite extends Accommodation{

    private List<CampSitePitch> sites;

    public CampSite(String name) {
        super(name);
        this.sites = new ArrayList<>();
    }

    public int numberOfSites(){
        return this.sites.size();
    }

    public void addCampSitePitch(CampSitePitch campSitePitch){
        this.sites.add(campSitePitch);
    }

    public int getSitePrice(CampSitePitch campSitePitch){
        return campSitePitch.getPrice();
    }
}
