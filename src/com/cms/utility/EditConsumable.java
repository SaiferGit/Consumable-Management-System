package com.cms.utility;

import java.util.Scanner;

public class EditConsumable implements Printable{

    private final String welcome = "Enter Consumable Name You Want To Edit: \n";
    Scanner input;
    String name, startingDate, endingDate;
    int choice;
    double rating, totalConsumptionDays, totalConsumptionHours;



    @Override
    public void initials() {
        System.out.println(welcome);
        input = new Scanner(System.in);
        name = input.nextLine();

    }
}
