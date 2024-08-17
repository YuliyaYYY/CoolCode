package practiceTasks;

import java.util.Scanner;

public class day11StartsWithX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = "xcodex";
        if (word.charAt(0) == 'x');
        word = word.replace('x', 'a');
        System.out.println(word);
    }


}

/*
Create a class named StartsWithX and write a program that asks user to enter a word.
If the word starts with x, replace it with a.
     Input:
      xcodex
     Output:
      acodex
 */