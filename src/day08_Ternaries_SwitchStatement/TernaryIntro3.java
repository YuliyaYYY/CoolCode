package day08_Ternaries_SwitchStatement;

public class TernaryIntro3 {

    public static void main(String[] args) {

        int score = 105;

        String result = (score >= 0 && score <= 100) ?
                (score >= 60) ? "passed" : "failed"
                : "invalid";

        System.out.println(result);

        System.out.println("-------------------------");

        int num = 3;

        String day = (num >= 1 && num <= 7)?
                (num == 1) ? "Monday" :(num == 2)? "Tuesday" :(num == 3)? "Wednesday" : "Thursday"
                : "invalid day";

        System.out.println(day);

    }
}






