package day17_customClass;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;


    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;

    }

        public double calcCost() {   // calculates the total price of the pizza, returns it as double
        double totalPrice = 0;
        switch(size){
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2 *(numberOfPepperoniTopping + numberOfCheeseTopping);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2 *(numberOfPepperoniTopping + numberOfCheeseTopping);
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
}

