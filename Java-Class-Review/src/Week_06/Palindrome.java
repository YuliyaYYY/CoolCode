package Week_06;

public class Palindrome {

    public static void main(String[] args) {

        String word = "java";
        String reversed = "";
        for (int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));

        }

        for(int i = word.length()-1; i >= 0; i--) {
            // System.out.println("i = " + i);
           // System.out.println(word.charAt(i));
            reversed += word.charAt(i);
        }

            System.out.println(reversed);

    }




}
