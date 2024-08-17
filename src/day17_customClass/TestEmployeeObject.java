package day17_customClass;

public class TestEmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("John",25,'M',"Teacher",95000, "A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Mark", 35,'M',"Engineer", 100000,"B34");

        Employee employee3 = new Employee();
        employee3.setInfo("Maria", 46,'F',"Lawyer",120000, "F24");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee2.work();

    }


}
