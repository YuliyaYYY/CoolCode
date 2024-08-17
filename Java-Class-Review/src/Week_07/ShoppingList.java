package Week_07;

import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        String myList = "";
        String answer = "";
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter item:");
            String item = input.next();
            myList += "  "+ item;

            System.out.println("Do you have more items?");
            answer = input.next();
        }while(answer.equalsIgnoreCase("yes"));

        System.out.println(myList);

    }
}
