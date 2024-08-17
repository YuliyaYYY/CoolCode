package day13_customMethods;

public class sumofTwoThreeFourNumbers {

    public static void main(String[] args) {

        System.out.println(sumOf2IntegerNumbers(10,20));
        System.out.println(sumOf3IntegerNumbers(10, 20, 30));
        System.out.println(sumOf4IntegerNumbers(10, 20, 30, 40));

    }


    public static int sumOf2IntegerNumbers(int n1, int n2) {
        return n1 + n2;
    }
    public static int sumOf3IntegerNumbers ( int n1, int n2, int n3) {
            return n1 + n2 + n3;
    }
    public static int sumOf4IntegerNumbers ( int n1, int n2, int n3, int n4) {
            return n1 + n2 + n3 + n4;

    }


}
