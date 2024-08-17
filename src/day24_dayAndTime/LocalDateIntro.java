package day24_dayAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args){

    LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthday = LocalDate.of(1985,5,2);

        System.out.println(birthday);

        System.out.println("----------------------------------------------");

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());
        System.out.println(birthday.getDayOfWeek());

        System.out.println("----------------------------------------");

        today = today.plusYears(1);

        System.out.println(today);

        LocalDate graduationDate = LocalDate.of(2025,6,4);

        graduationDate= graduationDate.plusYears(2); //2027

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        LocalDate yourBirthday = LocalDate.of(2005,4,1);

        LocalDate yourBrotherBirthday = yourBirthday.minusYears(2).minusMonths(3);

        System.out.println(yourBirthday);
        System.out.println(yourBrotherBirthday);

        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1995,5,7);

        boolean r1 = birthday1.isEqual(birthday2);

        System.out.println(r1);

        System.out.println("--------------------------------------");

        LocalDate grad_date = LocalDate.of(2023,1,1);
        System.out.println(grad_date.isBefore(LocalDate.of(2022,12,31)));


        System.out.println("--------------------------------");
        System.out.println( LocalDate.of(2022,6,16).isLeapYear());


    }
}
