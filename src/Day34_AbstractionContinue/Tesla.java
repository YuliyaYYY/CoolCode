package Day34_AbstractionContinue;

public class Tesla extends Car {

    public Tesla(String model, String color, int year, int price) {
        super(model, color, year, price);
    }

    protected void start(){
        System.out.println("Use voice control to start Tesla");

    }

    public void autoPilot(){
        System.out.println(getMake() +" "+getModel()+" has auto pilot feature");
    }


}
