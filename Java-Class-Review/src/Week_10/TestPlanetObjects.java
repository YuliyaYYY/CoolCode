package Week_10;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPlanetObjects {
    public static void main(String[] args) {
        Planet planet1 = new Planet();
        planet1.name = "Earth";
        planet1.distanceFromSun = 149_600_000L;
        System.out.println(planet1.toString());

        Planet planet2 = new Planet("Mercury", 57_910_000L);
        System.out.println(planet2);

        System.out.println("-------------------------------------");
        //  1) Array of planets
        Planet[] planetsArr = new Planet[3];
        planetsArr[0] = planet1;
        planetsArr[1] = planet2;
        planetsArr[2] = new Planet("Venus", 108_200_000L);
        System.out.println(Arrays.toString(planetsArr));

        // 2) Array List of Planets

        ArrayList<Planet> planetsList = new ArrayList<>();
        planetsList.add(new Planet("Mars", 227_900_000L));
        planetsList.add(new Planet("Jupiter", 778_300_000L));
        planetsList.addAll(Arrays.asList(planetsArr));
        System.out.println(planetsList.size());
        System.out.println(planetsList);


        for (Planet eachPlanet : planetsList) {
            System.out.println(eachPlanet.name);


        }
    }
}