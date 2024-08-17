package day08_Ternaries_SwitchStatement;

public class TernariesIntro {

    public static void main(String[] args) {

        int score = 85;
        String result;

        if(score >= 60){
            result = "passed";
        }else{
            result = "failed";
        }

        System.out.println(result);

        System.out.println("---------------------------------");

        String result2 = (score >= 60) ? "passed" : "failed";

        System.out.println(result2);

        System.out.println("---------------------");

        int age = 34;

        /*
        String = r;

        if(age >= 21) {
            r = "eligible";
        }else{
            r = "not eligible";
        }
       */

        String result3 = (age >= 21) ? "eligible" : "not eligible";

        System.out.println(result3);

    }
}
