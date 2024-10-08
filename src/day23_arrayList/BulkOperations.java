package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);


        list1.addAll(1,numbers);

        System.out.println(list1);

        System.out.println("---------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75, 85, 95, 70, 80));

        System.out.println(scores);

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList( "Julia", "Bob", "Tom", "Dylan"));

        System.out.println(students);

        students.addAll(2, Arrays.asList("Jim", "Emily", "Karen"));

        System.out.println(students);

        System.out.println("------------------------------");

        Integer[]nums = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));

     //  l1.addAll(Arrays.asList(nums));

        System.out.println(l1);

        System.out.println("--------------------------------------------");

        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("Julia", "Bob", "Tom", "Dylan"));

        System.out.println(employeesList);

        boolean hasJulia = employeesList.contains("Julia");
        boolean hasJuliaBob = employeesList.containsAll(Arrays.asList("Julia", "Bob"));
        System.out.println(hasJulia);
        System.out.println(hasJuliaBob);

        System.out.println("--------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10 , 10, 20, 20));

        list.removeAll(Arrays.asList(10, 20));

        System.out.println(list);

        System.out.println("---------------------------------");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Julia", "Bob", "Tom", "Dylan", "Ali"));

        developers.retainAll(Arrays.asList("Dylan", "Ali", "Bob"));

        System.out.println(developers);

        System.out.println("-----------------------------");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs", "Milk", "Bread", "Rice", "Pear", "Cucumbers", "Oil"));
        groceryList.retainAll(Arrays.asList("Eggs", "Milk", "Bread", "Rice"));
        System.out.println(groceryList);




    }
}
