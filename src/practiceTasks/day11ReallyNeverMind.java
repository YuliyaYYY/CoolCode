package practiceTasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class day11ReallyNeverMind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();
        String lastTwoChars = word.substring(word.length()-2);

        if(lastTwoChars.equals("ly")) {
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }

    }
}




/*
Create a class named ReallyNeverMind.
Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */
