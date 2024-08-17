package day08_Ternaries_SwitchStatement;

public class NumberToWord {
    public static void main(String[] args) {

        int number1 = 4;


        String number = (number1 == 1)? "One" :(number1 == 2)? "Two" :(number1 == 3)? "Three" :(number1 == 4)? "Four" : "Five";
        System.out.println(number);

    }
}



/*
Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 5 to words
			Ex:
				number = 1;
			output:
				One
		Note: MUST use ternary
 */
