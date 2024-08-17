package practiceTasks;

public class day11dayOfWeek {

    public static void main(String[] args) {

         day(5);

    }

    public static void day(int number){
        if (number == 1){
            System.out.println("Monday");
        }else if (number == 2){
            System.out.println("Tuesday");
        }else if (number == 3){
            System.out.println("Wednesday");
        }else if (number == 4){
            System.out.println("Thursday");
        }else if (number == 5){
            System.out.println("Friday");
        }else{
            System.out.println("Invalid number");
        }
    }
}

/*
Create a method named day that can display the name of the day based on the given number to the method,
if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

   output:
        Friday

 */