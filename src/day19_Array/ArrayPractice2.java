package day19_Array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {


        int[]numbers = new int[100];

        for (int i = 0, j = 1; i < numbers.length; i++, j++) {  //prints it from 1 to 100
            numbers[i] = j;
        }
        System.out.println(Arrays.toString(numbers));

        int[]numbersReversed = new int [100];

        for (int i = 0, j = 100; i < numbersReversed.length; i++, j--) {  // prints it from 100 to 1

            numbersReversed[i] = j;
        }

        System.out.println(Arrays.toString(numbersReversed));

        }
        
        }

