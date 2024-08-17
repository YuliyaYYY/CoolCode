/* package day32_FinalKeyword.personTask;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dateofBirth;


    public static final int numberofHead;

    static {
        numberofHead = 1;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(char gender, int age, LocalDate dateofBirth) {
        if (!(gender == 'M' || gender == 'F')) {
            System.out.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
        if (age <= 0) {
            System.out.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
        this.dateofBirth = dateofBirth;

    }


    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");

    }

    public void sleep() {
        System.out.println(name + " is sleeping");

    }

    public final void breath() {
        System.out.println(name + " is breathing");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateofBirth=" + dateofBirth +
                '}';
    }
}

 */