package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[]ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("------------------------------------------");

        String str2 = "Today is a great day";

        String [] words = str2.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("-------------------------------------------");



        String sentence = "I love Java";
        String[] arr = ArraysUtility.reverse(sentence.split(" ") );
        System.out.println(Arrays.toString(arr));





    }
}
