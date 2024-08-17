package Week_12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestCity {
    public static void main(String[] args) {

        City city1 = new City("Baltimore", -4.0,622104L, "Maryland");
        System.out.println("name = " +city1.getName());
        System.out.println("growth = " +city1.getGrowthRate());
        System.out.println("population = " +city1.getPopulation());
        System.out.println("state = " +city1.getState());


    }
}
