package Day31_InheritanceContinue;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Emily","Bengale",'F',4,"Small","Gray");
        Dog dog = new Dog("Rex","Boxer",'M',2,"Small","White");
        Lion lion = new Lion ("Simba","African Lion",'M',5,"Large","Yellow");
        Eagle eagle = new Eagle ("Bella","American Eagle",'F',7,"M","Black and White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("-------------------------------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

        System.out.println("--------------------------------------------------------");

        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();


    }

}
