package day09_scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score");
        int score = input.nextInt();
        input.close();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade is A");
        }else if (score >= 70 && score <=90){
            System.out.println("Grade is B");
        }else if (score >= 40 && score <=70){
            System.out.println("Grade is C");
        }else if (score >= 10 && score <= 40){
            System.out.println("Grade is D");
        }else if (score < 10) {
            System.out.println("Grade is F");
        }else{
            System.out.println("Invalid score");

        }
    }
}


/*
Create a class named GradeReport:
    2.1 Ask the user to enter the his/her score
    2.2 Print the grade of the student (A, B, C, D, F)
    2.3 If user enter invalid score (negative or more than 100) print invalid score

 */