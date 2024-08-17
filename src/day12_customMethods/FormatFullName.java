package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String first = input.next();

        System.out.println("Enter your last name:");
        String last = input.next();

        input.close();

        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        //getting first character of the first name + the ramaining characters of the first name

        last = last.substring(0, 1). toUpperCase()  + last.substring(1).toLowerCase();

        System.out.println(first);
        System.out.println(last);
        System.out.println(first + " " + last);

    }
}
