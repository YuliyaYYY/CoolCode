package day09_scanner;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

public class CrewandPassengers {

    public static void main(String[] args) {

        int number = 50;
        String result1 = (number == 50 || number == 75 || number == 100)?

                (number == 50)? "20 crew, 30 passengers"
                        :(number == 75)? "25 crew, 50 passengers"
                        : "30 crew, 70 passengers"

                : "Invalid";

        System.out.println(result1);

        System.out.println("---------------------------");

        String result2 = "";

        switch (number) {
            case 50 :
                result2 = "20 crew, 30 passengers";
             break;
            case 75 :
                result2 = "25 crew, 50 passengers";
             break;
            case 100 :
                result2 = "30 crew, 70 passengers";
                break;
            default:
                result2 = "Invalid number";
                break;

        }
        System.out.println(result2);
    }
}
