package day26_Statics;

public class IPhone {

    public static String brand = "Apple";
    public String model;
    public String color;
    public double price;
    public static String OS = "IOS";
    public static String madeIn = "China";
    public static boolean hasbattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensivetoFix = true;


    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
    }

    public static void printOperatingSystem(){
        System.out.println(OS);
    }
}
