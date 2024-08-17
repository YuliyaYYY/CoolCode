package day19_Array;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        String[]myGroup = new String[5];

        myGroup[0] = "Gulchin";
        myGroup[myGroup.length -1] = "Aseel";
        myGroup[2] = "Sumeye";
        myGroup[3]= "Julia";
        myGroup[1]= "John";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1]="Bob";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("-----------------------");

        for (int i = myGroup.length -1; i >= 0 ; i--) {

            System.out.println(myGroup[i]);

            System.out.println("--------------------");

            for (int i1 = 0; i1 < myGroup.length; i1++) {

                for (int i2 = myGroup.length - 1; i2 >= 0; i2--) {

                }
                System.out.println("---------------------");


            }




        }



    }
}
