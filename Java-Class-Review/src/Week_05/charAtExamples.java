package Week_05;

public class charAtExamples {

    public static void main(String[] args) {

        String str1 = "hi";
        System.out.println(str1.length());  // to get number of chars
        System.out.println("first char = " + str1.charAt(0)); // to print first char of the word "hi"

        str1 = str1.toUpperCase(); //HI
        System.out.println(str1.charAt(0)); //H

        String str2 = "hello";
        System.out.println(str2.toUpperCase().charAt(0)); //H
        System.out.println(str2.toUpperCase().charAt(2)); //L
        char second = str2.toUpperCase().charAt(2);
        System.out.println(second);

        System.out.println("------------------------");
        System.out.println("last = " + str2.charAt(str2.length()-1)); // to print last character
        System.out.println("last = " + str2.charAt(str2.length()-2)); // to print second second to last character
        System.out.println(str2.toUpperCase().charAt(str2.length()-2)); // convert to upper case first then print second to last character


    }
}
