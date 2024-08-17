package day26_Statics;

public class ConstructorCalls {

    public static void main(String[] args) {

        method1();

        System.out.println("-----------------------");

        method2();
    }


    public static void method1(){
        System.out.println("Method 1");

    }

    public static void method2(){
        method1();
        System.out.println("Method 2");
    }
}
