package com.cms.controller;

import com.cms.model.Art;
import com.cms.view.ArtView;

public class ArtController {
    private Art art;
    private ArtView artView;

    public ArtController(Art art, ArtView artView) {
        this.art = art;
        this.artView = artView;
    }

    public String getArtType(){
        return art.getType();
    }

    public String getArtName() {
        return art.getName();
    }

    public String getArtStartingDate() {
        if(art.getStartingDate().equals("0")) return "";
        return art.getStartingDate();
    }

    public String getArtEndingDate() {
        if(art.getEndingDate().equals("0")) return "";
        return art.getEndingDate();
    }

    public double getArtTotalConsumptionHours() {
        return art.getTotalConsumptionHours();
    }

    public String getArtRating() {
        if((int)art.getRating()== 0) return "";
        return Double.toString(art.getRating());
    }

    public int getArtTotalConsumptionDays() {
        return art.getTotalConsumptionDays();
    }

    public void showDetails(){
        artView.print(getArtType(), getArtName(), getArtStartingDate(),
                getArtEndingDate(), getArtTotalConsumptionHours(),
                getArtRating(), getArtTotalConsumptionDays());
    }

    public void showSpecific(String type){
        if(type.equals(getArtType()))
            artView.print(getArtType(), getArtName(), getArtStartingDate(),
                    getArtEndingDate(), getArtTotalConsumptionHours(),
                    getArtRating(), getArtTotalConsumptionDays());
        else return;
    }

}
