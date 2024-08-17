package Day25_constructors;

import java.time.LocalDate;
import java.time.LocalTime;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("Lucy", 32, 'F',"Developer", 95000, LocalDate.of(2022,12,30));
        System.out.println(e1);

        Employee e2 = new Employee("Tom",45,'M',"Teacher",57000, LocalDate.of(2019,3,15));
        System.out.println(e2);
    }
}
