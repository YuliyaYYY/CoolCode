package Week_02;

public class NumberTypes {

    public static void main(String[] args) {

        // declare apples

        // assign 15 to apples

        int apples = 15;

        apples = 15;

        System.out.println(apples);
        System.out.println("apples");

        int bananas = 10;

        System.out.println(bananas);

        byte n1 = 111;
        short n2 = 10555;
        int n3 = 383383838;
        long n4 = 3983987L;

        float n5 = 5.98F;
        double n6 = 676.8;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);



        //casting --> widening, small types --> large --> it is automatically casts/converts
        byte n7 = 44;
        short n8 = n7;
        // casting from larger to smaller type --> Explicit casting done manually
        int n9 = 4321;
        short n10 = (short)n9;



    }

}
