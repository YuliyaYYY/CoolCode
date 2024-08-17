package Week_04;

public class VehicleRecall {

    public static void main(String[] args) {

        int modelYear = 2002;
        if (modelYear >= 2001 && modelYear <= 2002) {
            System.out.println("Recall");
        } else {
            System.out.println("Not Recall");


            String result = (modelYear >= 2001 && modelYear <= 2002) ? "Recall" : "Not Recall";

            System.out.println(result);

        }
    }
}