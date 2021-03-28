package com.cms.utility;

import com.cms.Main;
import com.cms.database.StringBase;
import com.cms.model.Art;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddConsumable extends Validator implements Printable{
    Scanner input;
    private String name, startingDate, endingDate, type;
    private int choice, totalConsumptionDays;
    private double rating, totalConsumptionHours;
    Art art;

    @Override
    public void initials() {
        System.out.println(StringBase.consumableType);
    }

    public Art inputCredentials() {
        input = new Scanner(System.in);

        System.out.print("Enter Choice: ");
        type = isChoiceValid(input.nextInt());

        System.out.print("\nEnter Name: ");
        input.nextLine();
        name = input.nextLine();
        System.out.print("\nEnter Starting Date (YYYY-MM-DD) [Enter 0 to ignore]: ");

        startingDate = input.next();
        if(!isDateValid(startingDate))
            startingDate = "0";

        System.out.print("\nEnter Ending Date (YYYY-MM-DD) [Enter 0 to Ignore]: ");
        endingDate = input.next();
        if(startingDate.equals("0") || !isDateValid(endingDate))
            endingDate = "0";
        System.out.print("\nEnter Rating (out of 10) [Enter 0 to Ignore]: ");
        rating = input.nextDouble();
        if(rating != 0 || !isRatingValid(rating))
            rating = 0.0;

        System.out.print("\nEnter Total Consumption Days: ");
        totalConsumptionDays = input.nextInt();
        System.out.print("\nEnter Total Consumption (in Hours): ");
        totalConsumptionHours = input.nextDouble();
        art = new Art();
        art.setArt(type, name, startingDate, endingDate, totalConsumptionHours, rating, totalConsumptionDays);
        return art;

    }
}
