package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        array[0] = 100;
        System.out.println(Arrays.toString(array));

        System.out.println("--------------------");

        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Eggs");
        groceryList.add("Apples");
        groceryList.add("Oil");
        groceryList.add("Nuts");

        System.out.println(groceryList);

        groceryList.set(2,"Oranges");

        System.out.println(groceryList);

        groceryList.add(2, "Chicken");

        System.out.println(groceryList);

        System.out.println("--------------------------------");

        groceryList.remove(0);

        System.out.println(groceryList);

        groceryList.remove("Apples");

        System.out.println(groceryList);

        System.out.println("---------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        boolean r1 = numbers.remove(Integer.valueOf(10));

        System.out.println(numbers);

        System.out.println(r1);

        numbers.clear();

        System.out.println(numbers);

        System.out.println("------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Jessica");
        names.add("Tom");
        names.add("Jess");
        names.add("Tom");
        names.add("Bob");
        names.add("John");
        names.add("Jack");

        System.out.println(names.indexOf("Tom"));
        System.out.println(names.lastIndexOf("Tom"));

        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasAli = names.contains("Tom");

        System.out.println(hasMuhtar);
        System.out.println(hasAli);



    }
}
