package day06_ifStatements;

public class GradeLevel2 {

    public static void main(String[] args) {

        int gradeLevel = 9;

        String result = " ";

        if (gradeLevel >= 1 && gradeLevel <= 5) {
            result = "Elementary School";
        }
        if (gradeLevel >= 6 && gradeLevel <= 8) {
            result = "Middle School";
        }
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            result = "High School";
        }

            System.out.println(result);


        }

    }


