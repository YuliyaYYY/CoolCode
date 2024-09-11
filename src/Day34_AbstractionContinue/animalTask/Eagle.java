package Day34_AbstractionContinue.animalTask;

public class Eagle extends Animal implements Flyable{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating mice");

    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }


}
