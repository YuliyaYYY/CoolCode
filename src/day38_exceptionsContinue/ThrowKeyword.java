package day38_exceptionsContinue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if(age < 0 || age > 150){
            throw new InputMismatchException("Age of the person should not be negative");
        }else{
            throw new InputMismatchException("Age of the person can not be greater than 150");
        }

    }
}
