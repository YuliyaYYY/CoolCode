package day08_Ternaries_SwitchStatement;

import java.sql.SQLOutput;

public class TernarieIntro2 {

    public static void main(String[] args) {

        int number = 100;

        /*
        String result = "";
        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        } else {
            result = "zero";
        }
        */
        String result = (number > 0) ? "positive" : (number < 0) ? "Negative" : "zero";

        System.out.println("------------------------");

        int n = 1;
        /*
        String day = "";
        if (n == 1) {
            day = "Monday";
        } else if (n == 2) {
            day = "Tuesday";
        } else if (n == 3) {
            day = "Wednesday";
        } else if (n == 4) {
            day = "Thursday";
        }else{
            day = "Friday";
        }
        */
        String day = (n==1)? "Monday" :(n==2)? "Tuesday" :(n==3)? "Wednesday" :(n== 4)? "Thursday" : "Friday";
        System.out.println(day);

        System.out.println("---------------------------------------------");

        int num = 5;

        String month = (num == 1)? "January" :(num == 2)? "February" :(num==3)? "March" :(num==4)? "April" : "May";
        System.out.println(month);



    }
}