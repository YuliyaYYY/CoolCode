package Day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hired_date;

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hired_date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hired_date = hired_date;
    }  // allows us to set all the instance variables of the object as soon as the object is created.

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hired_date=" + hired_date.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    }// allows us to print the object when it is passed in the print statement.
}
