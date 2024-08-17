package day07_ifStatements;

public class GradeLevel2 {
    public static void main(String[] args) {

            int gradeLevel = 2;
            String result = "";

            if(gradeLevel <= 5){
            System.out.println( result + " Elementary School");
            }else if(gradeLevel <= 8){
            System.out.println(result + " Middle school");
            }else{
            System.out.println(result + " High School");

        }


    }

}
/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are: 1 ~ 5: Elementary school
6 ~ 8: Middle school 9 ~ 12: High school 13 ~ 16: College
17 ~ 18: Grad School
Note: Assume that the given number is between 1 ~ 18
 */