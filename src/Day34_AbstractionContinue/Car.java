package Day34_AbstractionContinue;

public abstract class Car {


    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public Car(String model, String color, int year, int price) {
        this.make = getClass().getSimpleName();
        this.model = model;
        setColor(color);
        this.color = color;
        if(year < 1986){
            System.out.println("invalid year");
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.out.println("invalid price");
            System.exit(1);
        }
        this.price = price;
    }

    protected final void stop(){
        System.out.println("Pressed the brake to stop" + make +" "+model);
    }
    protected abstract void start();

    @Override
    public String toString() {
        return make +"{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

}
