package com.cms.utility;

import com.cms.controller.ArtController;
import com.cms.model.Art;
import com.cms.view.ArtView;

import java.util.ArrayList;

public class OverallInfo implements Printable{

    private double totalTimeConsumption = 0, bookTimeConsump = 0,
            movieTimeConsump = 0, seriesTimeConsump = 0;
    private int totalDaysConsumption = 0, bookDaysConsump = 0,
            seriesDaysConsump = 0, movieDaysConsump = 0;
    private double totalavgRating = 0.0, booksRating = 0.0, movieRating = 0.0
            , seriesRating = 0.0;
    private int totalConsumable = 0, bookConsumable = 0, seriesConsumable = 0
            , movieConsumable = 0;

    private static final String welcome =
            "========================================"
            +"Overall Info: \n"
            + "========================================\n";

    @Override
    public void initials() {
        System.out.println(welcome);
    }

    public void overallInfo(ArrayList<Art> artList) {
        showTotalTimeConsumption(artList);
        showIndividualTimeConsumption(artList);
        showTotalConsumptionDays(artList);
        showIndividualConsumptionDays(artList);
        showTotalAvgRating(artList);
        showIndividualRating(artList);
        showTotalConsumable(artList);
        showIndividualConsumable(artList);
    }

    private void showTotalAvgRating(ArrayList<Art> artList) {
        int count = 0;
        for(Art art : artList){
            ArtView view = new ArtView();
            ArtController controller = new ArtController(art, view);
            if(!controller.getArtRating().isEmpty()){
                totalavgRating += Double.parseDouble(controller.getArtRating());
                count ++;
            }
        }
        System.out.printf("|Average rating across all types: %.2f                    |%n", (totalavgRating/ (double) count));
        System.out.printf("|---------------------------------------------------------|\n");

    }

    private void showIndividualRating(ArrayList<Art> artList) {
        int totalBooks = 0, totalMovies = 0, totalSeries = 0;
        for(Art art : artList){
            ArtView view = new ArtView();
            ArtController controller = new ArtController(art, view);
            if(controller.getArtType().equals("Book")){
                if(!controller.getArtRating().isEmpty()){
                    booksRating += Double.parseDouble(controller.getArtRating());
                    totalBooks ++;
                }
            }
            else if(controller.getArtType().equals("Movie")){
                if(!controller.getArtRating().isEmpty()){
                    movieRating += Double.parseDouble(controller.getArtRating());
                    totalMovies ++;
                }
            }
            else if(controller.getArtType().equals("Series")){
                if(!controller.getArtRating().isEmpty()){
                    seriesRating += Double.parseDouble(controller.getArtRating());
                    totalSeries ++;
                }
            }
        }
        System.out.printf("|Average individual rating of each type:                  |%n");
        System.out.printf("|(Book): %.2f%n", (booksRating/ (double) totalBooks));
        System.out.printf("|(Movie): %.2f%n", (movieRating/ (double) totalMovies));
        System.out.printf("|(Series): %.2f%n", (seriesRating/ (double) totalSeries));
        System.out.printf("|---------------------------------------------------------|\n");
    }

    private void showIndividualConsumptionDays(ArrayList<Art> artList) {
        for(Art art : artList){
            ArtView view = new ArtView();
            ArtController controller = new ArtController(art, view);
            if(controller.getArtType().equals("Book")){
                bookDaysConsump += controller.getArtTotalConsumptionDays();
            }
            else if(controller.getArtType().equals("Movie")){
                movieDaysConsump += controller.getArtTotalConsumptionDays();
            }
            else if(controller.getArtType().equals("Series")){
                seriesDaysConsump += controller.getArtTotalConsumptionDays();
            }
        }
        System.out.printf("|Individual days of consumption of each type:             |%n");
        System.out.printf("|(Book): %d%n", bookDaysConsump);
        System.out.printf("|(Movie): %d%n", movieDaysConsump);
        System.out.printf("|(Series): %d%n", seriesDaysConsump);
        System.out.printf("|---------------------------------------------------------|\n");
    }

    private void showTotalConsumable(ArrayList<Art> artList) {
        totalConsumable = artList.size();
        System.out.printf("|Total number of consumable across all types: %d          |%n",
                totalConsumable);
        System.out.printf("|---------------------------------------------------------|\n");
    }

    private void showIndividualConsumable(ArrayList<Art> artList) {
        for(Art art : artList){
            ArtView view = new ArtView();
            ArtController controller = new ArtController(art, view);
            if(controller.getArtType().equals("Book")){
                bookConsumable ++;
            }
            else if(controller.getArtType().equals("Movie")){
                movieConsumable ++;
            }
            else if(controller.getArtType().equals("Series")){
                seriesConsumable ++;
            }
        }
        System.out.printf("|Individual Number of Consumable of Each Type:            |%n");
        System.out.printf("|(Book): %d%n", bookConsumable);
        System.out.printf("|(Movie): %d%n", movieConsumable);
        System.out.printf("|(Series): %d%n", seriesConsumable);
        System.out.printf("|---------------------------------------------------------|\n");
    }

    private void showTotalConsumptionDays(ArrayList<Art> artList) {
        for(Art art : artList){
            ArtView view = new ArtView();
            ArtController controller = new ArtController(art, view);
            if(controller.getArtTotalConsumptionDays() > 0){
                totalDaysConsumption += controller.getArtTotalConsumptionDays();
            }

        }
        System.out.printf("|Total days of consumption across all types:  %d          |%n",
                totalDaysConsumption);
        System.out.printf("|---------------------------------------------------------|\n");
    }

    private void showIndividualTimeConsumption(ArrayList<Art> artList) {
        for(Art art : artList){
            ArtView view = new ArtView();
            ArtController controller = new ArtController(art, view);
            if(controller.getArtType().equals("Book")){
                bookTimeConsump += controller.getArtTotalConsumptionHours();
            }
            else if(controller.getArtType().equals("Movie")){
                movieTimeConsump += controller.getArtTotalConsumptionHours();
            }
            else if(controller.getArtType().equals("Series")){
                seriesTimeConsump += controller.getArtTotalConsumptionHours();
            }
        }
        System.out.printf("|Individual consumption time in hours of each type:       |%n");
        System.out.printf("|(Book): %.2f%n", bookTimeConsump);
        System.out.printf("|(Movie): %.2f%n", movieTimeConsump);
        System.out.printf("|(Series): %.2f%n", seriesTimeConsump);
        System.out.printf("|---------------------------------------------------------|\n");
    }

    private void showTotalTimeConsumption(ArrayList<Art> artList) {
        for(Art art : artList){
            ArtView view = new ArtView();
            ArtController controller = new ArtController(art, view);
            totalTimeConsumption += controller.getArtTotalConsumptionHours();
        }

        System.out.printf("|=========================================================|\n");
        System.out.printf("|Total consumption time in hours across all types: %.2f%n", totalTimeConsumption);
        System.out.printf("|---------------------------------------------------------|\n");
    }
}
