package day38_exceptionsContinue;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(char gender, String name, int age) {
        setName(name);
        setAge(age);
        if(!(gender == 'm'|| gender == 'f')) {
            throw new RuntimeException("Invalid gender");
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age == 0){
            throw new RuntimeException("Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }
}
