package day15_whileLoop;

import org.w3c.dom.ls.LSOutput;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (result.contains("" + str.charAt(i))) {
                continue;
            }

            result += str.charAt(i);

        }

             System.out.println(result);

    }


}


/*
3. Write a program that can remove the duplicated characters from the a string
Ex:
str = "aabbbcccc"

       output:
           abc
 */