package com.cms.utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class Validator {
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
    public boolean isDateValid(String dateStr) {
        try{
            if(dateStr.equals("0"))
                return true;
            LocalDate.parse(dateStr, this.dateTimeFormatter);
        } catch (DateTimeParseException e){
            System.out.println("Given Date is not valid, it will be ignored");
            return false;
        }
        return true;
    }

    public boolean isRatingValid(double rating){
        if(rating <= 0.1){
            System.out.println("Rating must be greater than 0, your given rating will be ignored");
            return false;
        }
        else if(rating >= 10.0){
            System.out.println("Rating must be less than 10, your given rating will be ignored");
            return false;
        }
        return true;
    }

    public String isChoiceValid(int choice){
        String type;
        if(choice == 1)
            return "Book";
        else if(choice == 2)
            return "Series";
        else if(choice == 3)
            return "Movie";
        else {
            System.out.println("You didn't put right choice, it is set 1 by default");
            return "Book";
        }
    }
}
