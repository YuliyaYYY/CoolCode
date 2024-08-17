package practiceTasks;

import java.util.Scanner;

public class day11WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 word:");
        String word = input.next();

        System.out.println(word.substring(1));

    }
}

/*
Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */