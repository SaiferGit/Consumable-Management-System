package com.cms;

import com.cms.controller.ArtController;
import com.cms.database.Database;
import com.cms.model.Art;
import com.cms.utility.*;
import com.cms.view.ArtView;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static int option = 1;
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Art> artList= new ArrayList<>();

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
                    if(delconsumable.deleteConsumable(artList))
                        System.out.println("Successfully Deleted");
                    break;

                case 4: // See the list of consumables
                    SeeConsumable print = new SeeConsumable();
                    print.printList(artList);
                    break;

                case 5: // See Overall info
                    new OverallInfo().overallInfo(artList);
                    break;
            }

        }

        exitTerminal();
    }

    private static void initializingDemoObj() {
        Database db = new Database();
        artList = db.getObjects();
    }

    private static void exitTerminal() {
        System.out.print("Exiting Terminal ...");
        in.close();
    }

}
