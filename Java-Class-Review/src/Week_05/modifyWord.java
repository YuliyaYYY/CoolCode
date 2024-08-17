package Week_05;

public class modifyWord {

    public static void main(String[] args) {

        String word = "javaj"; //results should be ava
        String result = "";

        if(word.charAt(0) == word.charAt(word.length()-1)) {
            System.out.println("first and last are same");
            result = word.substring(1, word.length() - 1);
        }
            System.out.println(word);
            System.out.println(result);

        }
    }

