package Week_07;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String input = "banana";
        String unique = "";


        for (int i = 0; i < input.length(); i++) {
            char each = input.charAt(i);
            if(!unique.contains(each+ "")) {
                unique += each;
            }

            System.out.println(unique);
        }
    }
}
