package Week_04;

public class ShelfLife {

    public static void main(String[] args) {

        int outsideTemperature = 90;
        int shelfLife = 10;

        if (outsideTemperature > 90) {
            shelfLife -= 4;
        }
        System.out.println("Shelflife = " + shelfLife);




    }
}
