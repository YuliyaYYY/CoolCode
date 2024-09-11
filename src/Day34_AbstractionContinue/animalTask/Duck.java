package Day34_AbstractionContinue.animalTask;

public class Duck extends Animal implements Playable,Flyable {


    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating bread");
    }

    @Override
    public void play() {
        System.out.println("Duck is playing in the water");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

}
