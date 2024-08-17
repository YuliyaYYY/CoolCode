package day06_ifStatements;

import javax.sound.midi.Soundbank;

public class IfAndElseStatementIntro {

    public static void main(String[] args) {

        int age = 28;

        if (age >= 21) {
            System.out.println("Eligible");
        }

        if (age < 21) {
            System.out.println("Not Eligible");
        }

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}