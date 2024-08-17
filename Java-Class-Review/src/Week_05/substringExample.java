package Week_05;

public class substringExample {

    public static void main(String[] args) {

        String str = "we have 91 people in java class";

        // number 91
        //class name

        String count = str.substring (8, 10);
        String className = str.substring( 21, 25);

        System.out.println(str);
        System.out.println(count);
        System.out.println(className);


    }
}
