package com.cms.utility;

import com.cms.controller.ArtController;
import com.cms.model.Art;
import com.cms.view.ArtView;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteConsumable implements Printable{

    private String name;
    private Scanner input = new Scanner(System.in);

    @Override
    public void initials() {
        System.out.print("Enter the consumable you want to delete: ");
        name = input.nextLine();

    }

    public boolean deleteConsumable(ArrayList<Art> artArrayList){
        Art art = new Art();
        art = findConsumable(artArrayList);
        if(art != null){
            artArrayList.remove(art);
            return true;
        }
        return false;
    }


    public Art findConsumable(ArrayList<Art> artList){
        for(Art art : artList){
            ArtView view = new ArtView();
            ArtController controller = new ArtController(art, view);
            if(controller.getArtName().equals(name)){
                return art;
            }
        }
        System.out.println("The Name You have entered, is Not Found");
        return null;
    }


}
