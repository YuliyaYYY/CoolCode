package Week_05;

public class extractValues {

    public static void main(String[] args) {

        String str1 = "Address=100 Main st";

        System.out.println(str1.indexOf("="));

        int idx = str1.indexOf("Main");

        System.out.println("idx of main = " + idx);

        String srAddress = str1.substring(8);

        System.out.println(srAddress);
    }
}
