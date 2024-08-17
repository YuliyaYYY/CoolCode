package day07_ifStatements;

public class GradeReport3 {

    public static void main(String[] args) {

        int score = 105;

        if (score >= 1 && score <= 100) {

            if (score >= 75) {
                System.out.println("A");
            } else if (score >= 50) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        } else {
            System.out.println("Invalid Score");
        }
    }
}