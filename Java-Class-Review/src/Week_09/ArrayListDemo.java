package Week_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList<>();
        list1.add(123);
        list1.add("hi");
        list1.add(33.4);
        list1.add('J');
        list1.add(3);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(4);
        list2.add(33);

        List<String> strings = new ArrayList<>();
        strings.add("java");
        strings.add("ruby");
        System.out.println(strings);

        var days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        System.out.println(days);

        //Assigning values:

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        System.out.println(colors);

        //2) Arrays.asList
        ArrayList<String> colors2 = new ArrayList<>(Arrays.asList("white", "green", "blue"));
        System.out.println(colors2);

        //3) List.of() - declare and assign Non-Modifiable arrayList
      //  List<String>topics = List.of("java", "api", "mobile");
     //   topics.add("playwright");
      //  System.out.println(topics);



    }
}
