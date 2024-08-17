package day06_ifStatements;

public class Cigarettes2 {

    public static void main(String[] args) {

        int age = 22;

        if(age >= 21){
            System.out.println("You are eligible to buy cigarettes");
        }
        if (age <= 21){
            System.out.println("You are not eligible to buy cigarettes");
            System.out.println("-----------------------------");
        }

    }
}

/*
1. Create a class named Cigarettes.java
2. A variable named age is declared and given, Write a program that can check if the person is eligible to buy cigarettes
Ex:
age = 20
output:
You are not eligible to buy Cigarettes
 */