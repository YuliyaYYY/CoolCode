package day16NestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        double num1 = input.nextDouble();

        System.out.println("Enter the math operator");
        char o = input.next().charAt(0);

        while ( !(o == '+' || o =='-' || o == '*' || o == '/') ) { // while the operator is invalid
            System.out.println("Invalid operator please re enter the math operator");
            o = input.next().charAt(0);

        }

        System.out.println("Enter your second number:");
        double num2 = input.nextDouble();

        double result = (o == '+')? num1 + num2 :(o == '-')? num1 - num2 :(o == '*')? num1 * num2 : num1 / num2;
        System.out.println(result);

    }
}
