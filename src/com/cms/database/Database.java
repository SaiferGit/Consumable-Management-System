package com.cms.database;

import com.cms.model.Art;

import java.util.ArrayList;

public class Database {


    public ArrayList<Art> getObjects(){
         return createObjects();
    }
    private ArrayList<Art>  createObjects(){
        ArrayList<Art> artList = new ArrayList<>();
        Art art1 = new Art(), art2 = new Art(), art3 = new Art(), art4 = new Art();
        Art art5 = new Art(), art6 = new Art(), art7 = new Art(), art8 = new Art();
        Art art9 = new Art(), art10 = new Art();

        // inserting data
        art1.setArt("Book", "Harry Potter", "2008-05-13", "2008-05-13", 5, 4.62, 2);
        art2.setArt("Book", "The Name of the Wind", "2008-05-13", "2008-05-13", 5, 0, 2);
        art3.setArt("Book", "The Way of Kings", "2008-05-13", "", 5, 4.61, 2);
        art4.setArt("Book", "Words of Radiance", "", "2008-05-13", 5, 4.74, 2);

        // adding book type art
        artList.add(art1);
        artList.add(art2);
        artList.add(art3);
        artList.add(art4);

        // inserting data
        art5.setArt("Series", "Breaking Bad", "2008-05-13", "2013-05-13", 5, 9.5, 2);
        art6.setArt("Series", "Game of Thrones", "2011-05-13", "2019-05-13", 5, 9.3, 2);
        art7.setArt("Series", "Sherlock", "2010-05-13", "2017-05-13", 5, 9.2, 2);

        // adding series
        artList.add(art5);
        artList.add(art6);
        artList.add(art7);

        // inserting data
        art8.setArt("Movie", "The Shawshank Redemption", "1994-05-13", "2008-05-13", 5, 9.2, 2);
        art9.setArt("Movie", "The Godfather", "1972-05-13", "", 5, 9.1, 2);
        art10.setArt("Movie", "The Dark Knight", "", "2008-05-13", 5, 9.0, 2);

        // adding movies
        artList.add(art8);
        artList.add(art9);
        artList.add(art10);

        return artList;
    }

}
