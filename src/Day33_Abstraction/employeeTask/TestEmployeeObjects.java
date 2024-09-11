package Day33_Abstraction.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Bob",55,'M',"A1","SDET",100000);
        Developer developer = new Developer("Rob",34,'F',"B4","Java Developer",110000,"Java");
        Driver driver = new Driver ("Sam",59,'M',"F9","Driver",65000);
        Tester tester = new Tester("Bill",28,'M',"H1","Tester",100000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(driver);

        System.out.println("-----------------------------");

        teacher.work();
        developer.work();
        tester.work();
        driver.work();

    }
}