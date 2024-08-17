package day32_FinalKeyword;

import java.time.LocalDate;

class CydeoStudent{

    public void language(){
        System.out.println("Java Programming");
    }
}

public class FinalKeyword {

    public static void main(String[] args) {
        final char gender = 'M';
        System.out.println(gender);
     // gender = 'F';
        System.out.println(gender);

        System.out.println("--------------------------------");

        LocalDate dateofBirth = LocalDate.now();
        System.out.println(dateofBirth);
    }
}
