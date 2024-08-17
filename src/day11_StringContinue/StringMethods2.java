package day11_StringContinue;

public class StringMethods2 {

    public static void main(String[] args) {

        String word = "java";
        word = word.replace('a','e');
        System.out.println(word);


        //--------------------

        String sentence2 = "I love Java, Java is cool";
        sentence2 = sentence2.replace("Java", "Python");
        System.out.println(sentence2);

        //-------------------------

        String email = "CydeoSchoolJavaProgramming@gmail.com";
        int beginning = email.indexOf('@') + 1;
        int ending  = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);

        System.out.println(domain);

        //---------------------------------

        String sentence6 = "I love Java programming";
        String r1 = sentence6.substring(7, sentence6.length());
        System.out.println(r1);

        System.out.println("---------------------------");

        String str = "Python";

        String result = (str + "\n").repeat (10);

        System.out.println(result);



    }
}
