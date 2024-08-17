package Week_10;

public class Planet {
    public String name;
    public long distanceFromSun;

    public Planet() {
        System.out.println("Creating planet object");
        name = "unknown";
        distanceFromSun = 0;
    }

    public Planet(String name, long distanceFromSun) {
        System.out.println("Creating planet object using name and distanceFromSun");
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distanceFromSun=" + distanceFromSun +
                '}';


    }
}
