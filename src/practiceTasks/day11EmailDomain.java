package practiceTasks;

public class day11EmailDomain {

    public static void main(String[] args) {

        emailDomain("Cydeo@gmail.com");

    }

    public static void emailDomain(String email) {

        String emailDomain = email.substring(6,11);
        System.out.println(emailDomain);

    }
}
/*
Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")
        output:
            domain: gmail
 */