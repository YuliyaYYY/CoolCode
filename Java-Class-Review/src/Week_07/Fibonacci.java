package Week_07;

public class Fibonacci {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int next = first + second;
        System.out.println(first+ " ");
        System.out.println(second+ " ");
        System.out.println(next+ " ");

        for (int i = 2; i < 10; i++) {
             first = second;
             second = next;
             next = first + second;
             System.out.println(next+ " ");
        }

    }
}
