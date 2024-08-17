package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int sum = 0;

    for (int i = 0; i < 10; i++) {

    System.out.println("Enter a number");
    sum += input.nextInt();

        }
        System.out.println("sum = " + sum);

    // write a program that can ask a user to enter a number 5 times and
        // then display a maximum number that you entered(use scanner)


    }


}
