package Week_08;

import java.util.Arrays;

public class ArrayUtils {

    public static void main(String[] args) {

        int[]nums ={11, 67, 55, 35, 99, 34, 75, 49, 83, 26, 12, 37};

        int target = 55;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
