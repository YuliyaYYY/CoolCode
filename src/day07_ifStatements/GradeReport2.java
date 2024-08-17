package day07_ifStatements;

import java.sql.SQLOutput;
import java.util.jar.JarOutputStream;

public class GradeReport2 {

    public static void main(String[] args) {
        int score = 95;

            if (score >= 75){
                System.out.println("A");
            } else if (score >= 50){
                System.out.println("B");
            }else{
                System.out.println("C");

            }
        }
    }

/*
1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a program that can print the grade of the student
Ex:
score = 95
output:
Your grade is A
Note: Assume that the given score is between 0 ~ 100
 */