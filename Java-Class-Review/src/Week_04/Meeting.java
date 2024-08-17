package Week_04;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Meeting {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Nice to meet you, " + name + "!");

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println(age + "- thats old");

        input.close();

    }
}
