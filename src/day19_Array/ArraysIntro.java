package day19_Array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int [] scores = new int [5];
        scores[2] = 78;
        scores[0] = 55;
        scores[1] = 79;
        scores[3] = 99;
        scores[4] = 88;

        // scores = new int[50];


        System.out.println( Arrays.toString(scores));

        System.out.println("---------------------------");

        for (int i = 0; i < scores.length; i++) {

            System.out.println(scores[scores.length-1]);

        }



    }
}
