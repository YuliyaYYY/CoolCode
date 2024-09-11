package Week_16;

import Week_14.Discord.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImplementations {

    public static void main(String[] args) {

        Map<Character, Integer> gradeScale = new HashMap<>();
        gradeScale.put('A', 90);
        gradeScale.put('B', 80);
        gradeScale.put('C', 70);
        gradeScale.put('D', 60);

        System.out.println(gradeScale);
        System.out.println(gradeScale.size());
        System.out.println(gradeScale.get('A'));
        System.out.println(gradeScale.keySet());
        System.out.println(gradeScale.values());
        System.out.println(gradeScale.remove('B'));
        System.out.println(gradeScale);

        if (gradeScale.containsKey('A')) {
            System.out.println(gradeScale.get('A'));

            Map<String,String> message = new HashMap<>();
            message.put("sender", "234-45-5678");
            message.put("receiver", "345-735-9238");
            message.put("message", "Hi, how are you today?");
            System.out.println(message);

            System.out.println("--------------------------------");

            Map<Integer,String> numsMap = new LinkedHashMap<>();
            numsMap.put(1, "one");
            numsMap.put(2, "two");
            numsMap.put(3, "three");
            numsMap.put(4, "four");
            numsMap.put(5, "five");
            System.out.println(numsMap);

            System.out.println("---------------------------");

            for(Map.Entry<Integer,String> entry : numsMap.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());

                // Lambda

                numsMap.forEach((k,v) -> System.out.println(k +" -> "+v));

                System.out.println("------------------------------");



            }
        }
    }
}
