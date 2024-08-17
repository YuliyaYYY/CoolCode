package day13_customMethods;

public class combineTwoWords {


    public static void main(String[] args) {

        String str3 = combine("one", "eight");
        System.out.println(str3);

    }

    public static String combine (String str1, String str2) {

        String result = "";

        //  if (str1.charAt(str1.length()-1) == str2.charAt(0) ){  // another way to write the code
        //  result = str1 + str2.substring(1); // another way to write the code
        //  }else{
        //  result = str1 + str2;

        if (str1.endsWith("" + str2.charAt(0) ) ) { // if the str1 end with the first characheter of the str2
            result = str1 + str2.substring(1);
        }else{
            result = str1 + str2;
        }

        return result;
    }


}
