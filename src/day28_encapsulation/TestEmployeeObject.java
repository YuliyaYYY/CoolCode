package day28_encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {

/*
        Employee employee1 = new Employee();

        employee1.setSalary(100000);

        System.out.println(employee1.getSalary());

        employee1.setName("Tom");

        System.out.println(employee1.getName());

*/

        Employee employee1 = new Employee("Bob",5000,"Teacher",39);

        System.out.println(employee1);


    }
}
