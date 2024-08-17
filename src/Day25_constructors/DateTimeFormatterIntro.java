package Day25_constructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("y-MMM-dd, EEEE");
        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:mm a");
        LocalTime time1 = LocalTime.of(7, 5);
        System.out.println(time1.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y/ hh:mm a");
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts.format(dtf));

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        LocalDateTime dateTime = LocalDateTime.of(2020, 11, 24, 13, 0);
        System.out.println(dateTime.format(dtf1));


    }
}


      // Tuesday, 1:00 pm, Nov/24/2020