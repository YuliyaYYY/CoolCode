package day42_MapsContinue;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Bob", "M");
        employeeMap.put("Tom", "M");
        employeeMap.put("Nickie", "F");
        employeeMap.put("Tony", "M");
        employeeMap.put("Jack", "M");
        employeeMap.put("Emily", "F");
        employeeMap.put("Kate", "F");

        // how many female and male employees in the map?

        int countMaleEmployees = 0;
        int countFemaleEmployees = 0;

        for (String eachValue : employeeMap.values()) {
            if (eachValue.equals("F")) {
                countFemaleEmployees++;
            }else{
                countMaleEmployees++;
            }
        }
        System.out.println(countFemaleEmployees);
        System.out.println(countMaleEmployees);

        System.out.println("--------------------------------");

        // display the names of al the female employees

        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if (gender.equals("F")) {
                System.out.println(name);
            }
        }

        System.out.println("----------------------------------");

        // update all "M" values with "Male", and all "F' with "Female"

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
         if (eachEntry.getValue().equals("M")) {
             eachEntry.setValue("Male");
         }else{
             eachEntry.setValue("Female");
         }
        }
        System.out.println(employeeMap);


    }
}
