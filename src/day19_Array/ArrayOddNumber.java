package day19_Array;

import java.util.Arrays;

public class ArrayOddNumber {
    public static void main(String[] args) {

        int[]Number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < Number.length; i++) {

            if (Number[i] % 2 == 0) {
                continue;

            }
            Number[i] = Number[i] * 2;

        }

        System.out.println(Arrays.toString(Number));

    }
}


/*
1. write a program that can multiply each odd number of an integer array by 2
		      ex:
		     array = [1,2,3,4,5];

	          output:
	      array =[2,2,6,4,10]
 */