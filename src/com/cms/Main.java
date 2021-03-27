package com.cms;


import com.cms.database.Database;
import com.cms.database.StringBase;
import com.cms.model.Art;
import com.cms.utility.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static int option = 1;
    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Art> artList= new ArrayList<>();

    public static void main(String[] args) {

        System.out.print(StringBase.welcome);
        initializingDemoObj();

        while(option >= 1 && option < 6){
            System.out.print("Enter Your Options: ");
            option = in.nextInt();

            switch (option){
                case 1:// Add a consumable
                    AddConsumable addConsumable = new AddConsumable();
                    addConsumable.initials();
                    artList.add(addConsumable.inputCredentials());
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
