package com.cms.view;

public class ArtView{
    public void printSpecific(String type, String name, double totalConsumptionHours,
                              double rating, int totalConsumptionDays){
        System.out.format("%-12s%-20s%-12.2f%-12.2f%-10d%n", type,
                name, totalConsumptionHours,
                rating, totalConsumptionDays);
    }

    public void print(String type, String name, String startingDate,
                              String endingDate, double totalConsumptionHours,
                              String rating, int totalConsumptionDays){
        System.out.format("|%-12s|%-25s|%-15s|%-15s|%-26.2f|%-10s|%-25d|%n", type, name,
                startingDate, endingDate, totalConsumptionHours,
                rating, totalConsumptionDays);

    }
}
