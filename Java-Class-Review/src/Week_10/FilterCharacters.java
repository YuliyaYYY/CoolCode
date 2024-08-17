package Week_10;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterCharacters {

    public static void main(String[] args) {
        String str = "abcd@!#$etyi123lkjhagwer%^&879";
        //  System.out.println(Arrays.toString(str.toCharArray())); using toCharArray method, converts str.to Array,
        //  returns char[] array with each character.
        //  System.out.println(Arrays.toString(str.split(""))); using split method, returns String Array.

        String[] allCharsArray = str.split("");
        ArrayList<String> allChars = new ArrayList<>(Arrays.asList(allCharsArray));
        System.out.println(allChars);

        // create new ArrayList digits and loop allChars list.
        // if char is digit(Character.isDigit()) then add to digits arrayList
        ArrayList<String> digits = new ArrayList<>();
        for (String eachChar : allChars) {
            if (Character.isDigit(eachChar.charAt(0))) {  //convert String to Char
                digits.add(eachChar);
            }
        }
        System.out.println(digits);

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(allChars);
        letters.removeIf(each -> !Character.isLetter(each.charAt(0)));
        System.out.println(letters);

        ArrayList<String>special = new ArrayList<>();
        special.addAll(allChars); // remove all characters that are letters or numbers.
        special.removeIf(each -> Character.isLetterOrDigit(each.charAt(0)));
        System.out.println(special);
    }
}

