package day06_ifStatements;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class PosNegZero {
    public static void main(String[] args) {

        int number = 20;

        if (number >= 0){
            System.out.println(number + " is Positive");
        }
        if (number <= 0){
            System.out.println(number + " is Negative");
        }
        if (number == 0){
            System.out.println(number + " is Zero");
        }
    }

}
/*
1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given,
 Write a program can identify if the number is positive, negative or zero
Ex:
number = 20
output: Positive
 */