package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("A02", "Josh");
        map.put("A03", "Jack");
        map.put("A04", "Bob");
        map.put("A05", "Jill");
        map.put("A06", "Nick");

        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.get("A03"));

        map.put("A04", "Kate");

        System.out.println(map);

        System.out.println(map.get("A05"));

        map.replace("A06", "Julia");

        System.out.println(map);

        map.remove("A05");

        System.out.println(map);

        System.out.println(map.containsKey("A06"));
        System.out.println(map.containsValue("F56"));
        System.out.println(map.containsValue("Julia"));
        System.out.println("-------------------------------");
        System.out.println(map.isEmpty());
        System.out.println(map.equals(map));

        map.clear();

        System.out.println(map);


    }
}
