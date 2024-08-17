package day05_Operators;

public class ShorthhandOperators {

    public static void main(String[] args) {

        int a = 20;

        System.out.println( a ); // 20

        a = 40;

        System.out.println( a ); // 40

        a = 90;

        System.out.println( a ); // 90

        double balance = 100;

        balance += 1000; //balance = 100 + 1000

        System.out.println("balance = " + balance);

        balance += 500; // balance = 1000 + 500

        System.out.println("balance = " + balance);

        balance -= 1000; // balance = 11600 - 1000

        System.out.println("balance = " + balance);

        double salary = 45000;

        salary *= 2; // balance = 45000 * 2

        System.out.println(salary);

        double eth = 4;

        eth *= 250;

        System.out.println(eth);

        eth /= 2;

        System.out.println("eth = " + eth);

        salary /= 2;

        System.out.println(salary);

        int b = 39;

        b %= 7; // b = 39 % 7

        System.out.println(b);




    }
}
