package day32_FinalKeyword.carTask_methodOverriding;

public class BMW extends Car{

    public BMW(String model, String color, int year, double price) {
        super(model, color, year, price);

    }


    public void start(){
        System.out.println("Call the mechanic or jump start " +getMake()+" "+getModel());
    }

}
