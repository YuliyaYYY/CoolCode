package day42_MapsContinue;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPratice2 {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "John");
        person1.put("gender", 'M');
        person1.put("age", 22);
        person1.put("job title", "Developer");
        person1.put("salary", 100000);
        person1.put("married", true);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 52);
        person2.put("job title", "Teacher");
        person2.put("salary", 100000);
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        Map<String, Object> person4 = new LinkedHashMap<>();
        Map<String, Object> person5 = new LinkedHashMap<>();
        List<Map<String, Object>>listOfMaps = new ArrayList<>();
        listOfMaps.add(person1);
        listOfMaps.add(person2);

        System.out.println(listOfMaps);

    }
}
