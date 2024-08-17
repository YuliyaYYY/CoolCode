package practiceTasks;

public class Day14OddandEven {


    public static void main(String[] args) {

        System.out.println(isEven(4));
        System.out.println(isOdd(3));

    }

    public static boolean isOdd(int number){
         return number % 2 == 1;

    }

    public static boolean isEven(int number){
         return number % 2 == 0;

    }


}










    /*
   public static void main(String[] args) {

     OddAndEven(5);

    }

    public static void OddAndEven(int number) {

        if (number % 2 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False"); /*
        }
    }
}


/*
1. Create a class named OddAndEven:
1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.

	Example:
     boolean result = isOdd(100);
    Output:
     false
 */