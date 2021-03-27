package com.cms;

import com.cms.controller.ArtController;
import com.cms.model.Art;
import com.cms.utility.*;
import com.cms.view.ArtView;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static int option = 1;
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Art> artList= new ArrayList<>();
    private static ArrayList<Art> MovieartList= new ArrayList<>();
    private static final String welcome ="====================================================================\n"
            + "| Welcome to Consumer Management System. Enter value [1-6] for below actions.\n"
            + "+----------------------------------------+\n"
            + "| 1. Add a consumable                    |\n"
            + "+----------------------------------------+\n"
            + "| 2. Edit a consumable                   |\n"
            + "+----------------------------------------+\n"
            + "| 3. Delete a consumable                 |\n"
            + "+----------------------------------------+\n"
            + "| 4. See the list of consumables         |\n"
            + "+----------------------------------------+\n"
            + "| 5. See Overall info                    |\n"
            + "+----------------------------------------+\n"
            + "| 6. Exit                                |\n"
            + "====================================================================\n";
    private static String rowLine = "+------------+-------------------------+---------------"
            + "+---------------+--------------------------+----------+-------------------------+";
    public static void main(String[] args) {

        System.out.print(welcome);
        initializingDemoObj();

        while(option >= 1 && option < 6){
            System.out.print("Enter Your Options: ");
            option = in.nextInt();

            switch (option){
                case 1:// Add a consumable
                    new AddConsumable().initials();
                    artList.add(new AddConsumable().inputCredentials());
                    System.out.println("Consumable added successfully!!!");
                    break;

                case 2: // Edit a consumable
                    EditConsumable editconsumable = new EditConsumable();
                    editconsumable.findandEditConsumable(artList);
                    break;

                case 3: // Delete a consumable
                    DeleteConsumable delconsumable = new DeleteConsumable();
                    delconsumable.initials();
                    if(delconsumable.deleteConsumable(artList)) System.out.println("Successfully Deleted");
                    break;

                case 4: // See the list of consumables
                    SeeConsumable print = new SeeConsumable();
                    print.printList(artList);

                    //display();
                    break;

                case 5: // See Overall info
                    new OverallInfo().overallInfo(artList);
                    break;
            }

        }

        exitTerminal();
    }

    private static void initializingDemoObj() {
        Art art1 = new Art();
        Art art2 = new Art();
        Art art3 = new Art();
        Art art4 = new Art();
        Art art5 = new Art();
        Art art6 = new Art();
        Art art7 = new Art();
        Art art8 = new Art();
        Art art9 = new Art();
        Art art10 = new Art();
        // adding book type art
        art1.setArt("Book", "Harry Potter", "2008-05-13", "2008-05-13", 5, 4.62, 2);
        artList.add(art1);

        art2.setArt("Book", "The Name of the Wind", "2008-05-13", "2008-05-13", 5, 0, 2);
        artList.add(art2);
        art3.setArt("Book", "The Way of Kings", "2008-05-13", "", 5, 4.61, 2);
        artList.add(art3);
        art4.setArt("Book", "Words of Radiance", "", "2008-05-13", 5, 4.74, 2);
        artList.add(art4);

        // adding series
        art5.setArt("Series", "Breaking Bad", "2008-05-13", "2013-05-13", 5, 9.5, 2);
        artList.add(art5);
        art6.setArt("Series", "Game of Thrones", "2011-05-13", "2019-05-13", 5, 9.3, 2);
        artList.add(art6);
        art7.setArt("Series", "Sherlock", "2010-05-13", "2017-05-13", 5, 9.2, 2);
        artList.add(art7);

        // adding movies
        art8.setArt("Movie", "The Shawshank Redemption", "1994-05-13", "2008-05-13", 5, 9.2, 2);
        artList.add(art8);
        art9.setArt("Movie", "The Godfather", "1972-05-13", "", 5, 9.1, 2);
        artList.add(art9);
        art10.setArt("Movie", " The Dark Knight", "", "2008-05-13", 5, 9.0, 2);
        artList.add(art10);

    }

    private static void exitTerminal() {
        System.out.print("Exiting Terminal ...");
        in.close();
    }

}
