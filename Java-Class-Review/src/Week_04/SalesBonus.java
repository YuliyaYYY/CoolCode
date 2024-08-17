package Week_04;

import java.sql.SQLOutput;

public class SalesBonus {

    public static void main(String[] args) {

        int salesAmount = 16000;
        int bonus;

        if (salesAmount >= 15000){
            bonus = 7000;
        } else if (salesAmount >= 10000 && salesAmount < 15000){
            bonus = 5000;
        } else {
            bonus = 0;
        }

            System.out.println("salesAmount = " + salesAmount);
            System.out.println("bonus = " + bonus);

        System.out.println("-------------------------");
            bonus = (salesAmount >= 15000)? 7000 : (salesAmount >= 10000) ? 5000 : 0;
        System.out.println("bonus = " + bonus);

    }
}
