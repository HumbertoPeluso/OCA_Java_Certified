package chapterthree.corejavaapis.workingwithdatesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManupulatingDatesAndTimes {
    public static void main(String[]args){

         LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
         System.out.println(date); // 2014-01-20
         date = date.plusDays(2);
         System.out.println(date); // 2014-01-22
         date = date.plusWeeks(1);
         System.out.println(date); // 2014-01-29
         date = date.plusMonths(1);
         System.out.println(date); // 2014-02-28
         date = date.plusYears(5);
         System.out.println(date); // 2019-02-28

       // There are also nice easy methods to go backward in time. This time, let’s work with  LocalDateTime.
         LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
         LocalTime time = LocalTime.of(5, 15);
         LocalDateTime dateTime = LocalDateTime.of(date2, time);
         System.out.println(dateTime); // 2020-01-20T05:15
         dateTime = dateTime.minusDays(1);
         System.out.println(dateTime); // 2020-01-19T05:15
         dateTime = dateTime.minusHours(10);
         System.out.println(dateTime); // 2020-01-18T19:15
         dateTime = dateTime.minusSeconds(30);
         System.out.println(dateTime); // 2020-01-18T19:14:30

        /*It is common for date and time methods to be chained. For example, without the print
        statements, the previous example could be rewritten as follows:*/
        LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time3 = LocalTime.of(5, 15);
        LocalDateTime dateTime3 = LocalDateTime.of(date3, time3)
                .minusDays(1).minusHours(10).minusSeconds(30);

       /* When you have a lot of manipulations to make, this chaining comes in handy. There are
        two ways the exam creators can try to trick you. What do you think this prints?*/
        LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
        date4.plusDays(10); //  Adding 10 days was useless because we ignored the result. Because it's immutable
        System.out.println(date4);

        /*The exam also may test to see if you remember what each of the date and time objects
        includes. Do you see what is wrong here?*/
        LocalDate date5 = LocalDate.of(2020, Month.JANUARY, 20);
       // date5 = date5.plusMinutes(1); // DOES NOT COMPILE -- LocalDate does not contain time.

        /*
                                         Can call on                  Can call on             Can call on
                                         LocalDate?                   LocalTime?              LocalDateTime?


        plusYears/minusYears                Yes                           No                       Yes

        plusMonths/minusMonths              Yes                           No                       Yes

        plusWeeks/minusWeeks                Yes                           No                       Yes

        plusDays/minusDays                  Yes                           No                       Yes

        plusHours/minusHours                No                            Yes                      Yes

        plusMinutes/minusMinutes            No                            Yes                      Yes

        plusSeconds/minusSeconds            No                            Yes                      Yes

        plusNanos/minusNanos                No                            Yes                      Yes
        */


    }
}
