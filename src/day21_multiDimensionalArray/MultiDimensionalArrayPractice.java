package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {
        
        String[] group1 = {"James", "Daniel", "Tom", "Peter"};
        String[] group2 = {"Julia","Jessica", "Bob"};
        String[] group3 = {"Tom","Kate","John","Robert","Samara"};
        String[] group4 = {"Buck","Eduardo"};
        
        String[][]groups = {group1, group2, group3, group4};

        for (int i = 0; i < groups.length; i++) {
            String[]eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
             String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }

        System.out.println("------------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);

            }
        }

        for (int i = groups.length - 1; i >= 0; i--) {
            String[]eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);

            }
        }

        System.out.println("--------------------------------");

        System.out.println(groups);

        System.out.println(Arrays.toString(groups));

        System.out.println(Arrays.deepToString(groups));

    }

}
