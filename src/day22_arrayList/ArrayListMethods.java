package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);

        list.add(1, 15);

        System.out.println(list);

        list.add(2,25);

        System.out.println(list);

        System.out.println("-------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Jessica");
        studentsList.add("John");
        studentsList.add("Bob");
        studentsList.add("Tom");

        System.out.println(studentsList);
        String firstStudent = studentsList.get(3);
        System.out.println(firstStudent);
        studentsList.get(studentsList.size() -1);
        System.out.println(firstStudent);






    }
}
