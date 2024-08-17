package practiceTasks;

public class day14SalaryCalculator {

    public static void main(String[] args) {

        double result = Salary(30.50,40);
        System.out.println(Salary(30.50,40));

    }
        public static double Salary(double hourlyRate, int weeklyHours){

        double result = hourlyRate * weeklyHours * 52;
        return result;


    }
}


/*
Create a class named Salary and create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0
 */