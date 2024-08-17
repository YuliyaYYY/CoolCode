package Week_04;

import java.sql.SQLOutput;

public class Language {
    public static void main(String[] args) {
        String language = "English";

        switch (language) {
            case "English":
                System.out.println("Hello, thank you for your call");
                break;
            case "Spanish":
                System.out.println("Hola, gracias para llamar");
                break;
            case "Russian":
                System.out.println("Privet, spasibo za vash zvonok");
                break;
        }
    }
}