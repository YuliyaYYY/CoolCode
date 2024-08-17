package practiceTasks;

import java.util.Scanner;

public class day11ReplaceX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1 = "xcodeX";
        word1 = word1.replace("X", "a");
        word1 = word1.replace("x", "a");
        System.out.println(word1);
    }
}





/*
Create a class named ReplaceX, and write a program that asks user to enter a word.
and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */