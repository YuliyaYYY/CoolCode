package Week_10;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeReview {

    public static void main(String[] args) {

        // get current day to today variable
        LocalDate today = LocalDate.now();
        System.out.println(today);
        // add 100 days
        LocalDate daysAfter = today.plusDays(100);
        System.out.println(daysAfter);
        // print day of the week for today and after 100 days
        System.out.println(today.getDayOfWeek());
        System.out.println(daysAfter.getDayOfWeek());

        // print days of the year for each one

        System.out.println(today.getDayOfYear());
        System.out.println(daysAfter.getDayOfYear());

        // create date for december 31 2024
        LocalDate lastDayOf2024 = LocalDate.of(2024, 12, 31);
        System.out.println(lastDayOf2024);
        System.out.println(lastDayOf2024.getDayOfYear());

        // print one months return period
        // purchaseDate and returnDate then print "eligible for return" or "not eligible for return"

        LocalDate purchaseDate = LocalDate.of(2024, 1, 15);
        LocalDate returnDate = LocalDate.of(2024, 2, 5);
           if(returnDate.isBefore(purchaseDate.plusDays(30))) {
            System.out.println("eligible to return");
        }else{
            System.out.println("not eligible to return");
        }
           // store opens at 6 am and closes at 9 pm, check if store is open right now

           LocalTime open = LocalTime.of(6,0);
           LocalTime close = LocalTime.of(21,0);
           if(LocalTime.now().isAfter(open) && LocalTime.now().isBefore(close)) {
               System.out.println("Store is open");
           }else{
               System.out.println("Store is close");
           }

           // print open, close, current time in this format:
           // Store opens at 6:00 AM and closes at 9:00PM, and now is 12:35 PM


    }
}