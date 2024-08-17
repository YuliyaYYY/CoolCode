package Week_05;

public class ReverseShortString {

    public static void main(String[] args) {

        //  0123
        String word = "abcd";
        // check word has 4 characters
        if (word.length() == 4) {
            String reversed = "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);

            System.out.println(word);
            System.out.println(reversed);
        } else {
            System.out.println("Is not 4 characters");

        }
    }
}


/* "abcd" -> "dcba"
   "java" -> "avaj"
 */

