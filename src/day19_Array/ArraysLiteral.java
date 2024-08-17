package day19_Array;

import java.util.Arrays;

public class ArraysLiteral {


    public static void main(String[] args) {

        int[]numbers = new int[5];

        int[] nums = {10,20,30,40,50};// Array Literal

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(nums));

        System.out.println("---------------------------");

        String[]days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

                int n = 3;

        System.out.println(days[n-1]);

        System.out.println("---------------------------");

        String[]month = {"January","February","March","April","May"};
        System.out.println(Arrays.toString(month));

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);

        }

        }




    }

