package day07_ifStatements;

public class GradeLevel3 {
    public static void main(String[] args) {

        int gradeLevel = 20;
        String result = "";

        if(gradeLevel >= 1 && gradeLevel <= 18){
            if(gradeLevel <= 5) {
                System.out.println(result + "Elementary School");
            }else if (gradeLevel <= 8){
                System.out.println(result + "Middle School");
            }else if (gradeLevel <= 12){
                System.out.println(result + "High School");
            }else{
            System.out.println(result + "Grad School");
        }

            }else{
            System.out.println("Invalid Grade");
    }

}

    }



/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in. (Only if the given number is a valid number, then print the school type.
Otherwise print Invalid) Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are: 1 ~ 5: Elementary school
6 ~ 8: Middle school 9 ~ 12: High school 13 ~ 16: College
17 ~ 18: Grad School
 */