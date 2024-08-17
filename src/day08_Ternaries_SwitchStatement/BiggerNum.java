package day08_Ternaries_SwitchStatement;

import java.sql.SQLOutput;

public class BiggerNum {

    public static void main(String[] args) {

          int n1 = 10;
          int n2 = 20;
          int n3 = 30;

          String number = (n1 >= n2)? "n1 is bigger" : (n2 >= n3 && n3 >= n1)? "n2 is bigger" : "n3 is bigger";
          System.out.println(number);

        System.out.println("-----------------------");

        System.out.println( (n1 > n2 && n1 > n3 ? n1 : n2 > n1 && n2 > n3 ? n2 : n3 ) + " is bigger");


    }
}

/*
Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.
        you get 3 int variables with DIFFERENT values: n1 , n2 and n3
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
         NOTE: MUST USE TERNARY
 */