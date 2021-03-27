package com.cms.utility;

import com.cms.controller.ArtController;
import com.cms.database.StringBase;
import com.cms.model.Art;
import com.cms.view.ArtView;

import java.util.ArrayList;
import java.util.Scanner;

import static com.cms.database.StringBase.endingDateWarningMessage;

public class EditConsumable implements Printable, Inputtable{

    Scanner input = new Scanner(System.in);;
    private String  name, endingDate;
    private double rating, totalConsumptionHours;
    private int totalConsumptionDays;
    private Art art;



    @Override
    public void initials() {
        System.out.print("Enter the consumable you want to edit: ");
        name = input.nextLine();
    }

    public void findandEditConsumable(ArrayList<Art> artList) {
        initials();
        art = findConsumable(artList); // find if the name exist
        editConsumable(artList); // edit the name
    }

    private void editConsumable(ArrayList<Art> artList) {
        int index = artList.indexOf(art); // getting index from iterator
        if(index != -1){ // indexOf return -1
            inputCredentials();
            artList.set(index, art);
            System.out.println("Successfully updated");
        }
        System.out.println(StringBase.rowRuler);
    }

    private Art findConsumable(ArrayList<Art> artList) {
        for(Art art : artList){
            ArtView view = new ArtView();
            ArtController controller = new ArtController(art, view);
            if(controller.getArtName().equals(name)){
                if(!art.isEndingDateUpdated())
                    return art;
                else{
                    System.out.printf("You can not update %s TWICE!%n", name);
                }
            }
        }
        return null;
    }

    @Override
    public void inputCredentials() {
        System.out.println(StringBase.editWelcome);
        totalConsumptionHours = input.nextDouble();
        art.setTotalConsumptionHours(totalConsumptionHours);
        System.out.println("Enter Consumption Days: ");
        totalConsumptionDays = input.nextInt();
        art.setTotalConsumptionDays(totalConsumptionDays);
        System.out.println("Enter Rating: ");
        rating = input.nextDouble();
        art.setRating(rating);
        System.out.println(endingDateWarningMessage);
        if(!input.nextLine().equals("\n")){
            endingDate = input.next();
            art.setEndingDate(endingDate);
            art.setEndingDateUpdated(true);
        }

    }
}
