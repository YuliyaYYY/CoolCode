package day16NestedLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "Java Java Java Java";
        String word = "Java";

        int count = 0;

        while(sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst(word,""); //

        }
        System.out.println(count);

    }
}


/*
Write a program that can return the frequency of the word java from a sentence.
 */