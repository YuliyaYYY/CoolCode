package day08_Ternaries_SwitchStatement;

public class Loans {

    public static void main(String[] args) {

        int salary = 90000;
        int credit_score = 700;


        String loan = (salary >= 60000) && (credit_score >= 650)? "Approved" : "Not approved";
        System.out.println(loan);

    }
}







/*
Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.
                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.

 */