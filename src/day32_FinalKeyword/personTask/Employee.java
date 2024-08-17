/*package day32_FinalKeyword.personTask;

import java.time.LocalDate;

public class Employee extends Person{

    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        super(name);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public Employee(char gender, int age, LocalDate dateofBirth, String jobTitle, double salary) {
        super(gender, age, dateofBirth);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }


    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
*/