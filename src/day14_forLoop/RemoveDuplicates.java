package day14_forLoop;

public class RemoveDuplicates {


    public static void main(String[] args) {

        String str = "aabbbcccc";

        String result = "";  // at the end will contain new String "abc"

        for(int i = 0; i < str.length(); i++) { //i: index numbers of str ( starting from 0)

            char each = str.charAt(i);

            if(!result.contains("" + each)){ // if the string result does not contain the character of string str yet
                result += each; // then we will add hte character to the string result

            }
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