package day36_polymorphismContinue;

public class SquareEqualsMethod {

    private double side;

    public SquareEqualsMethod(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object obj) {
         if (obj instanceof SquareEqualsMethod) {
             System.out.println("Invalid object");
             System.exit(1);
         }
         if (side == ((SquareEqualsMethod) obj).side) {
             return true;
         }
           return false;
    }
}
