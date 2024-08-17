package day21_multiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {



        //
        int[][] arr2D = { {10, 20, 30} , {40, 50, 60, 70, 80} , {90, 100} };
    // index of 1D Array     0                 1                  2

        for (int i = 0; i < arr2D.length; i++) {

            int[]each1D = arr2D[i];
            System.out.println(Arrays.toString(arr2D[i]));

            for (int j = 0; j < each1D.length; j++) {
                int eachElement = each1D[j];
                System.out.println(eachElement);

            }

            }

        System.out.println("---------------------------------");

        for (int[] each1DArray :arr2D){

            System.out.println(Arrays.toString(each1DArray));

            for ( int eachElement : each1DArray){

                System.out.println(eachElement);
            }
        }

            System.out.println("---------------------------------");

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.println(arr2D[i][j]);

            }
        }
           System.out.println("----------------------------------");

          for(int[]each1DArray : arr2D){
              for (int eachElement : each1DArray) {
                  System.out.println(eachElement);

              }
          }
        }
    }

