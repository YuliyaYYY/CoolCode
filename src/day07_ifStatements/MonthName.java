package day07_ifStatements;

import java.sql.SQLOutput;

public class MonthName {
    public static void main(String[] args) {

        int number = 2;
        String month = "";

        if (number >= 1 && number <=12) {

        }else{
            System.out.println(" No such a month ");
        }
        if (number == 1) {
            System.out.println("January");
        } else if (number == 2) {
            System.out.println("February");
        } else if (number == 3) {
            System.out.println("March");
        } else {
            System.out.println("December");
        }


    }


}

/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a program that can print the name of the month that the number represents
Ex: Given:
number = 10
output: October
 */