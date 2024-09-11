package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_methods {

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("A02", "Josh");
        map.put("A03", "Jack");
        map.put("A04", "Bob");
        map.put("A05", "Jill");
        map.put("A06", "Nick");

        Map<String, String> employess = new LinkedHashMap<>();
        employess.putAll(map);

        System.out.println(employess);

        System.out.println(map == employess);

        System.out.println(map.equals(employess));

    }
}
