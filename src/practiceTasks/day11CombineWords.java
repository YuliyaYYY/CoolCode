package practiceTasks;


import java.util.Scanner;

public class day11CombineWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word:");
        String word1 = input.next();
        System.out.println("Enter your second word:");
        String word2 = input.next();
        input.close();

        if(word1.charAt(word1.length()-1) == word2.charAt(0)) {
            System.out.println(word1 + word2.substring(1));
        }else{
            System.out.println("Incorrect output");

        }
    }
}

/*
Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the last letter is the same, print
that character once.
                Input:
                    one
                    eight
                Output:
                    oneight
 */