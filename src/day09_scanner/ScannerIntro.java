package day09_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

// import java.util.*;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        byte num1 = input.nextByte();

        System.out.println("You entered: " +num1);



    }
}
