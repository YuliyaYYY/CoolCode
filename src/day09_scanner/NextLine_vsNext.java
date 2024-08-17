package day09_scanner;

import java.util.Scanner;

public class NextLine_vsNext {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your age");

        int age = input.nextInt();

        System.out.println("Enter your full name");

        String full_name = input.next();

        System.out.println("age = " +age);
        System.out.println("full_name = " + full_name);




    }
}
