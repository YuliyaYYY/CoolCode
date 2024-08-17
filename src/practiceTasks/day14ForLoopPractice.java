package practiceTasks;

public class day14ForLoopPractice {

    public static void main(String[] args) {

        for(int i = 10; i >= 5; i--) {

            System.out.println("Hello Cydeo");
        }

           // System.out.println("Hello World");

        System.out.println("----------------------");

        // sum of number 1 - 100

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
            System.out.println(sum);
            System.out.println("------------------------");

        // print all the alphabet letters A - Z
        for (char i = 'A'; i <= 'Z'; i++) {

            //System.out.println(i);
            System.out.print(i + " ");

        }
            System.out.println();
            System.out.println("----------------------");

          // print all the alphabet letters in backwards Z - A

            for (char i = 'Z'; i >= 'A'; i--){
                System.out.print(i + "\n");  //Cydeo will be printed from the new line
            }

                 System.out.println("Cydeo");
    }
}
