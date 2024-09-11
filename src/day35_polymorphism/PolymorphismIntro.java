package day35_polymorphism;

import Day34_AbstractionContinue.animalTask.*;

import java.awt.print.Paper;

public class PolymorphismIntro {

    public static void main(String[] args) {

      Dog dog = new Dog("Max","Husky",'M',4,"Small","White");
      Cat cat = new Cat("Max","",'M',4,"Small","White");
      Tiger tiger = null;
      Eagle eagle = null;
      Lion lion = null;
      Parrot parrot = null;
      Dolphin dolphin = null;
      Shark shark = null;
      Duck duck = null;

      Animal[] animals = {dog,cat,tiger,lion,eagle,parrot,dolphin,shark,duck};
        }


}


