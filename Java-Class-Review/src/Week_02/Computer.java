package Week_02;

public class Computer {

    public static void main(String[] args) {

        String brand = "HP";
        String processor = "Intel";
        byte memory = 32;
        String storage = "500GB";
        double price = 605.99;
        byte numberOfUsbSlots = 5;

        boolean hasBluetooth, hasWifi;
        hasBluetooth = true;
        hasWifi = true;

        System.out.println("brand = "  + brand);
        System.out.println("processor = " + processor);
        System.out.println("memory = " + memory + "GB");
        System.out.println("storage = " + storage);
        System.out.println("price = " + "S" + price);
        System.out.println("USB slots = " + numberOfUsbSlots);
        System.out.println("Has Bluetooth = " + hasBluetooth + "\nHas Wifi = " + hasWifi);


    }
}
