package com.cms.model;

public class Art {
    private String type;
    private String name = "";
    private String startingDate = "";
    private String endingDate = "";
    private double totalConsumptionHours = 0.0;
    private double rating = 0;
    private int totalConsumptionDays = 0;
    private boolean isEndingDateUpdated = false;

    public void setArt(String type, String name, String startingDate, String endingDate, double totalConsumptionHours, double rating, int totalConsumptionDays) {
        this.type = type;
        this.name = name;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
        this.totalConsumptionHours = totalConsumptionHours;
        this.rating = rating;
        this.totalConsumptionDays = totalConsumptionDays;
        this.isEndingDateUpdated = false;
    }

    public boolean isEndingDateUpdated() {
        return isEndingDateUpdated;
    }

    public void setEndingDateUpdated(boolean updated) {
        isEndingDateUpdated = updated;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public void setTotalConsumptionHours(double totalConsumptionHours) {
        this.totalConsumptionHours = totalConsumptionHours;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setTotalConsumptionDays(int totalConsumptionDays) {
        this.totalConsumptionDays = totalConsumptionDays;
    }


    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public double getTotalConsumptionHours() {
        return totalConsumptionHours;
    }

    public double getRating() {
        return rating;
    }

    public int getTotalConsumptionDays() {
        return totalConsumptionDays;
    }
}
