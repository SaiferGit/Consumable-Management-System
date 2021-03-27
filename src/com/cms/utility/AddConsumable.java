package com.cms.utility;

import com.cms.Main;
import com.cms.model.Art;

import java.util.ArrayList;
import java.util.Scanner;

public class AddConsumable implements Printable{
    private final String welcome = "Enter Consumable Type [1-3]: \n"
            + "1. Book\n" + "2. Series\n" + "3. Movie\n";
    Scanner input;
    String name, startingDate, endingDate, type;
    int choice, totalConsumptionDays;
    double rating, totalConsumptionHours;

    Art art;

    @Override
    public void initials() {
        System.out.println("From Add Consumable Class.....");
        System.out.println(welcome);
    }


    public Art inputCredentials() {
        input = new Scanner(System.in);

        System.out.print("Enter Choice: ");
        choice = input.nextInt();

        if(choice == 1)
            type = "Book";
        else if(choice == 2)
            type = "Series";
        else if(choice == 3)
            type = "Movie";

        System.out.print("\nEnter Name: ");
        input.nextLine();
        name = input.nextLine();
        System.out.print("\nEnter Starting Date (YYYY-MM-DD) [Enter 0 to ignore]: ");
        startingDate = input.next();
        System.out.print("\nEnter Ending Date (YYYY-MM-DD) [Enter 0 to ignore]: ");
        endingDate = input.next();
        System.out.print("\nEnter Rating: ");
        rating = input.nextDouble();
        System.out.print("\nEnter Total Consumption Days: ");
        totalConsumptionDays = input.nextInt();
        System.out.print("\nEnter Toal Consumption (in hours): ");
        totalConsumptionHours = input.nextDouble();
        input.close();
        art = new Art();
        art.setArt(type, name, startingDate, endingDate, totalConsumptionHours, rating, totalConsumptionDays);
        return art;

    }
}
