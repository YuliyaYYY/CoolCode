package day10_String;

import java.sql.SQLOutput;

public class StringMethods1 {

    public static void main(String[] args) {

        String str = "Cydeo";
        // index:     01234

        char firstChar = str. charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char fourthChar = str.charAt(3);
        char fifthChar = str.charAt(4);


        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

        System.out.println("-----------------------");

        String s1 = "Wooden Spoon";
        char f = s1.charAt(0);
        int lastIndexNum = s1.length() -1;
        char l = s1.charAt(lastIndexNum);
        System.out.println(f + " : " + l);

        System.out.println("--------------------------");

        String name1 = "Sun";
        String name2 = new String("Sun");
        System.out.println(name1 == name2);


    }
}
