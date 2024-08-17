package day12_customMethods;

public class CustomMethodPractice {

    public static void main(String[] args) {

        maxNum(10, 20);

        System.out.println("--------------------------");

        maxNum(2500, 1500);

        initial("Cydeo", "School");
        initial("Julia", "Smith");
    }

    public static void maxNum(double num1, double num2) {

        if (num1 > num2) {
            System.out.println(num1 + " Num1 is maximum number");
        } else if (num2 > num1) {
            System.out.println(num2 + " Num2 is maximim number");
        } else {
            System.out.println("Equal");


        }

        }

     public static void initial(String firstName, String lastName){
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println("initial is: " + initial);
     }


}
