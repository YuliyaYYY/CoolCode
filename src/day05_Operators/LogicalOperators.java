package day05_Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        double salary = 25000;
        int creditScore = 700;
        int age = 25;


        boolean eligibleForLoan = salary  >= 30000 && creditScore >= 650 && age >=18;

        System.out.println(eligibleForLoan);

        age = 35;
        String country = "Japan";

        boolean eligibleToVote = age >= 18 && country == "USA";

        System.out.println(eligibleToVote);

        char grade = 'B';

        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';

        System.out.println(passedTheExam);

        int score = 65;

        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = +failed");
    }

}
