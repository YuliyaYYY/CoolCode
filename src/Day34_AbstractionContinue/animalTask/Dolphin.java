package Day34_AbstractionContinue.animalTask;

public class Dolphin extends Animal implements Playable{

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin is eating fish");
    }

    @Override
    public void play() {
        System.out.println("Dolphin is playing");
    }

}
