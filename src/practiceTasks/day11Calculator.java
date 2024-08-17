package practiceTasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class day11Calculator {

    public static void main(String[] args) {

        calculate(20, 30, '+');

        /*

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers");
        double n1 = input.nextDouble(),
                n2 = input.nextDouble();
        char operator = input. next().charAt(0);

        calculate(n1, n2, operator);


         */
        System.out.println("-------------------------------------------");

        ageGroup(20);

        System.out.println("-------------------------------------------");

        eligibleToVote(35, false);

    }

    public static void calculate(double num1, double num2, char mathOperator) {


        switch (mathOperator) {

            case '+':

                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
            break;

            case '-':

                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
            break;

            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
            break;

            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
            break;

            default:
                System.out.println("Invalid operator");
                break;

        }


    }

    public static void ageGroup(int age) {

        if (age >= 0 && age <= 150) {

            System.out.println((age < 21) ? "Teenager" : (age < 55) ? "Adult" : "Senior");

        } else {
            System.out.println("Invalid age");
        }

    }

    public static void eligibleToVote(int age, boolean isAmerican){

        if(age >= 18 && isAmerican){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }

}
