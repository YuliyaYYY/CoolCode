package practiceTasks;

public class day11EligibleToVote {

    public static void main(String[] args) {

        eligibleToVote(15, true);

    }

    public static void eligibleToVote(int age, boolean isAmerican){


        if(age>= 18 && isAmerican) {
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }

}
