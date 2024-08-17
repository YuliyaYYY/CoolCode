package day29_Inheritance;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',3,"Large","White");

        Cat cat = new Cat();
        cat.setInfo("Lucy","stray",'F',2,"Small","White");

        System.out.println(dog);
        System.out.println(cat);

        System.out.println("-----------------------------------------");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();

        System.out.println("-------------------------------");

        dog.bark();

    }

}
