package Day31_InheritanceContinue;

import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println("Dog "+getName()+ " is eating dog food");
    }
    public void bark(){
        System.out.println("Dog "+getName()+ " is barking");

    }

}
