package Week_07;

public class DivideNumbers {

    public static void main(String[] args) {
         int i = 1;
         while (i <= 5) {

             System.out.println(i++ +" ");
             i++;
         }

        System.out.println("-----------------------");

         int num1 = 10;
         int num2 = 3;
         int count = 0;

         while (num1 >= num2) {
             num1 = num1 - num2;
             count++;
         }

        System.out.println(count);
    }
}
