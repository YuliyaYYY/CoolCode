package Day31_InheritanceContinue;

public class Airplane extends vehicle{

    public Airplane(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void fly(){
        System.out.println(getBrand()+" "+getModel()+ "is flying");


    }

}
