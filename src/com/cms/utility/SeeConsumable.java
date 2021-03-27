package com.cms.utility;

import com.cms.controller.ArtController;
import com.cms.model.Art;
import com.cms.view.ArtView;

import java.util.ArrayList;
import java.util.Scanner;

public class SeeConsumable implements Printable{

    private final String consumableType = "Enter Consumable Type [1-3]: \n"
            + "1. Book\n" + "2. Series\n" + "3. Movie\n";
    private final String listType = "You Want to visualize: \n"
            + "1. All the List\n" + "2. Individually\n" + "Enter Choice: ";
    private String rowLine = "+------------+-------------------------+---------------"
            + "+---------------+--------------------------+----------+-------------------------+";

    Scanner input;
    int choice;
    @Override
    public void initials() {
        System.out.println("From See Consumable Class.....");
        System.out.println(listType);

    }

    // print the list if list is not empty
    public void printList(ArrayList<Art> artList){
        initials();
        if(artList.isEmpty()){
            System.out.println("No Art has recorded");
            return;
        }
        input = new Scanner(System.in);
        // if choice is 1 then display full list, go to else otherwise
        choice = input.nextInt();
        if(choice == 1) displayList(artList);
        else{
            System.out.println(consumableType);
            choice = input.nextInt();
            switch (choice){
                case 1:
                    displaySpecific("Book", artList);
                    break;

                case 2:
                    displaySpecific("Series", artList);
                    break;

                case 3:
                    displaySpecific("Movie", artList);
                    break;
            }
        }
    }

    private void displaySpecific(String type, ArrayList<Art> artList) {
        headerFormat();
        System.out.println(rowLine);
        for(Art art : artList){
            ArtView view = new ArtView();
            ArtController controller = new ArtController(art, view);
            controller.showSpecific(type);
        }
        System.out.println(rowLine);
    }

    private void displayList(ArrayList<Art> artList) {
        headerFormat();
        for(Art art : artList){
            ArtView view = new ArtView();
            ArtController controller = new ArtController(art, view);
            System.out.println(rowLine);
            controller.showDetails();
        }
        System.out.println(rowLine);
    }

    private void headerFormat() {
        System.out.println(rowLine);
        System.out.format("|%-12s|%-25s|%-15s|%-15s|%-26s|%-10s|%-10s|%n", "Type", "Name",
                "Starting Date", "Ending Date", "Total Consumption (Hour)", "Rating", "Total Days of Consumption");
    }


}
