package day13_customMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {

        System.out.println(max(40,20));

    }

    public static int max(int n1, int n2) {

        // return n1 > n2 ? n1 : n2;

        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
}
