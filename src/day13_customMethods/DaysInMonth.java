package day13_customMethods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();
        if (month < 1|| month > 12) {
            System.out.println("Invalid month");
            return;
        }

        /*
           if(month == 2) {
               System.out.println("February");
           }else if (month == 3) {
               System.out.println("March");
           }else if (month == 4) {
               System.out.println("April");
           }else if (month == 5) {
               System.out.println("May");
           }else{
                   System.out.println("June");
         */

       // System.out.println ((month == 2)? "February" : (month == 3)? "March" : (month == 4)? "April" : (month == 5)? "May" : (month == 6)? "June" : "July");
        // System.out.println(month);

        switch (month){
            case 2:
                System.out.println("28 days");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("30 days");
                break;
            default:
                System.out.println("31 days");
                break;
        }

        }

    }


