package day37_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try {
        }catch (RuntimeException e) {
            System.out.println("Runtime Exception has been caught");
            e.printStackTrace();
          //  System.exit(1);
        }finally{
            System.out.println("Finally Block");

        }
    }
}
