package practiceTasks;

public class day11monthName {

    public static void main(String[] args) {

          monthName(5);

    }

    public static void monthName(int number){
        if(number == 1) {
            System.out.println("January");
        }else if (number == 2) {
            System.out.println("February");
        }else if (number == 3) {
            System.out.println("March");
        }else if (number == 4) {
            System.out.println("April");
        }else if (number == 5){
            System.out.println("May");
                }else{
                    System.out.println("Invalid number");

                }
            }
        }


/*
Create a method named monthName that can display the name of the month based on the given number to the method,
if the number is invalid, then the method should print the error message "Invalid Number"
   Ex:     monthName(6)
   output: June
 */