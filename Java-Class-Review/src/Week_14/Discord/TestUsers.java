package Week_14.Discord;

import java.time.LocalDate;

public class TestUsers {

    public static void main(String[] args) {

        Admin admin = new Admin("Admin","Bob","james7", LocalDate.now());

        System.out.println(admin);

        admin.createChannel("Soft skills");
        admin.sendMessage();
        admin.joinDiscord("Cydeo B-36");

        System.out.println("-------------------------------");

        Student student =  new Student("Student","Jack","Jack76", LocalDate.now());

        System.out.println(student);
        student.joinDiscord("Cydeo B-36");
        student.sendMessage();
        student.sendMessage("Asiya");

    }
}
