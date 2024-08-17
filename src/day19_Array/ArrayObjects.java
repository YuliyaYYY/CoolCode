package day19_Array;

import java.util.Arrays;

public class ArrayObjects {

    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = arr1;
        int[] arr3 = arr2;

        arr1[3]= 500;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println("--------------------");

        String[] a1 = {"Bob", "John"};

        a1 = new String[]{"James","Kelly"};

        System.out.println(Arrays.toString(a1));


    }
}
