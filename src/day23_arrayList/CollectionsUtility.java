package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5 ,6, 7, 1, 2, 3, 4, 6, 7 ,8));
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);
        System.out.println("-----------------------------------------");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Apples", "Bananas", "Meat", "Fish"));
        Collections.sort(items);
        System.out.println(items);

        System.out.println("------------------------------------------");

        Collections.reverse(items);

        System.out.println(items);

        System.out.println("------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList( "Julia", "Bob", "Tom", "Dylan"));

        Collections.swap(students,0,3);
        System.out.println(students);
    }
}
