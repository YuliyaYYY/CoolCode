package day37_exceptions;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {

        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost() {   // calculates the total price of the pizza, returns it as double
        double totalPrice = 0;
        switch (size) {
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);
                break;
            default:
                System.out.println("Invalid size");
                break;
        }

        return totalPrice;


    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price =" + calcCost() +
                '}';


    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pizza)) {
            System.out.println("Invalid object");
            System.exit(1);
        }

        Pizza pizza = (Pizza) obj;

        if (size == pizza.getSize()) {
            if (numberOfPepperoniTopping == pizza.getNumberOfPepperoniTopping()) {
                return true;
            }
        }

        return false;

    }
}


