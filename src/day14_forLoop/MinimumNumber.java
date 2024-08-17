package day14_forLoop;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647;

        for(int i = 0; i < 5; i++){
        System.out.println("Enter a number");
        int num = input.nextInt();

        if(num < min){ // if the user entered entry is greater than the current min number that we have
            min = num; // then user entered number should be the min number
        }

    }

        System.out.println("Minimum number is: " + min);

        input.close();

}


}


/*
2. Write a program that can ask the user to enter a number for 5 times and returns the minimum number
 */