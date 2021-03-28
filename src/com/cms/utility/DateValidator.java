package com.cms.utility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator {
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
    public boolean isDateValid(String dateStr) {
        try{
            LocalDate.parse(dateStr, this.dateTimeFormatter);
        } catch (DateTimeParseException e){
            System.out.println("Given Date is not valid, it will be ignored");
            return false;
        }
        return true;
    }
}
