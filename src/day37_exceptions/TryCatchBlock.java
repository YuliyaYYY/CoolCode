package day37_exceptions;

public class TryCatchBlock {

    public static void main(String[] args) {

        System.out.println("Test started");

        try {
            System.out.println(9 / 0);

            System.out.println("Try block");

        } catch (ClassCastException e) {
            System.out.println("Catch block");

            System.out.println("Test ended");
        }
    }
}