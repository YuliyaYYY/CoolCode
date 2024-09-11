package day38_exceptionsContinue;

public class Test {

    public static void main(String[] args) {

        System.out.println("Hello Cydeo");

      //  Thread.sleep(3500);
      //  Library.sleep(3.5);

        System.out.println("How are you today?");
    }

    public static void method2(){

        System.out.println("First program started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("First program ended");
    }
}
