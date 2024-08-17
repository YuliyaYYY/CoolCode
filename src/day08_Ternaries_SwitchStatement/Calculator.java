package day08_Ternaries_SwitchStatement;

import java.sql.SQLOutput;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 100;
        double n2 = 50;
        char mathOperator = '-';

        switch(mathOperator) {
            case '+':
                System.out.println("n1 + n2 = " + "150");
                break;
            case '-':
                System.out.println("n1 - n2 = " + "50");
                break;
            case '/':
                System.out.println("n1 / n2 = " + "2");
                break;
            case '*':
                System.out.println("n1 * n2 = " + "5000");
                break;
            default:
                System.out.println("invalid operator");
                break;
        }
    }
}
/*
Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator,
write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /
		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"
		Ex:
			n1 = 10, n2= 20, mathOperator = '+'
		output:
			30
		Note: MUST use switch statement
 */