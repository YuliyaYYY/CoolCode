package Week_09;

import java. util.*;  // import all classes in util package

public class LoopingArrayList {

    public static void main(String[] args) {

        ArrayList<String>colors = new ArrayList<>(Arrays.asList("red", "black", "green"));
        System.out.println(colors.size());
          //1) for loop:
               for(int i = 0; i<colors.size(); i++) {
                   System.out.println(colors.get(i));
               }
          //2) for each loop:
               for(String eachColor : colors){
                   System.out.println("eachColor= " + eachColor);
               }
          //3) while loop with iterator:
              Iterator<String>it = colors.iterator();
               while(it.hasNext()){
                   System.out.println(it.next());
               }


    }
}
