package Day34_AbstractionContinue.animalTask;

import javax.sound.midi.Soundbank;

public class Shark extends Animal {



    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Shark is eating fish");
    }


}
