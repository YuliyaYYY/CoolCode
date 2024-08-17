package day19_Array;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {

        char[]ascending = new char[26];
        char[]descending = new char[26];

        for (int i = 0, j = 'A', k = 'Z'; i < ascending.length; i++, j++, k--) {
            ascending[i] = (char)j;  // A - Z
            descending[i] = (char)k; // Z -A

            }

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));

        System.out.println("-----------------------------------------------");


    }
}





/*
Create a char array and store all the alphabet letter in ascending order

Create a char array and store all the alphabet letter in descending order
 */