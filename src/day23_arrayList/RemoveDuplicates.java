package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

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

        ArrayList<String> nonDup = new ArrayList<>();

        for(String each : names) {
            if(nonDup.contains(each)){
                continue;
            }

            nonDup.add(each);
        }

         //   names = nonDup;

        System.out.println(names);
        System.out.println(nonDup);

        System.out.println("------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();



    }
}
