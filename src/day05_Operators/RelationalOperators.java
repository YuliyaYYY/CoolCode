package day05_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 1000;
        int b = 200;

        System.out.println(a > b);

        boolean aIsGreater = a > b;

        System.out.println(aIsGreater);

        int score = 60;

        boolean passed = score >= 60;

        System.out.println(passed);

        int age = 21;

        boolean eligibleToBuyAlcohol = age >= 21;

        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18;

        System.out.println(eligibleToVote);
    }
}
