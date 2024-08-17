package day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {


    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Jessica");
        names.add("Tom");
        names.add("Jess");
        names.add("Bob");
        names.add("Bob");
        names.add("John");
        names.add("Jack");
        names.add("Tiffany");
        names.add("John");

        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each))
                System.out.println(each);


        }
    }
}