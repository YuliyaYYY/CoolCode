package day14_forLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Cydeo School";

        String reverse = ""; //"avaJ"

        for (int i = str.length() - 1; i >= 0; i--) {  // for (int i = str.lenght()-1 ; i >= 0 ; i--) for unlimited Strings
             reverse += str.charAt(i);

        }
               System.out.println(reverse);
               System.out.println("----------------------------------------------");
               String name = "Julia Yarmolovychina";
               String result = reverse(name);

               System.out.println(result);

    }

        public static String reverse(String str){
           String reverse = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);

            }

               return reverse;
        }





}
