package day20_forEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int[]score = {70, 200, 100, 65, 56};

        System.out.println(Arrays.toString(score));

        System.out.println("------------------------------");

        int[]a1 = {1, 2, 3, 4, 5};
        int[]a2 = {1, 2, 3, 4, 5};

        boolean r1 = Arrays.equals(a1, a2);

        System.out.println(r1);

        System.out.println("--------------------------------");

        int[]nums = {100, 80, 45, 4, 2, 66, 877};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("-----------------------------");

        int[] array = {10, 20, 30, 40, 50, 60};

        int[] array2 = Arrays.copyOf(array, 6);

        System.out.println(Arrays.toString(array2));

        System.out.println("-----------------------------");

        char[]ch = {'A', 'B', 'C', 'D', 'E'};

        char[]result1 = Arrays.copyOf(ch, 3);

        System.out.println(Arrays.toString(result1));

        char[]result2 = Arrays.copyOfRange(ch,2,4);

        System.out.println(Arrays.toString(result2));




    }
}
