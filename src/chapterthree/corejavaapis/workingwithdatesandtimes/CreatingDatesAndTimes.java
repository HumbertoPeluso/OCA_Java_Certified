package chapterthree.corejavaapis.workingwithdatesandtimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CreatingDatesAndTimes {
    public static void main(String[] args) {

        /*When working with dates and times, the fi rst thing to do is decide how much information you need. The exam
        gives you three choices:*/

        // LocalDate
        /*Contains just a date—no time and no time zone. A good example of
        LocalDate is your birthday this year. It is your birthday for a full day regardless of what
        time it is.*/

        //LocalTime
        /*Contains just a time—no date and no time zone. A good example of
        LocalTime is midnight. It is midnight at the same time every day.*/

        // LocalDateTime
       /* Contains both a date and time but no time zone. A good example of
        LocalDateTime is “the stroke of midnight on New Year’s.” Midnight on January 2 isn’t
        nearly as special, and clearly an hour after midnight isn’t as special either.*/

        //  Ready to create your fi rst date and time objects?
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        //  let’s create just a date with no time. Both of these examples create the same date:
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        /*You can specify just
        the hour and minute, or you can add the number of seconds.You can even add nanoseconds if you want to be very
        precise*/
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

        //we can combine dates and times:
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        /*Did you notice that we did not use a constructor in any of the examples? The date and
        time classes have private constructors to force you to use the static methods. The exam
        creators may try to throw something like this at you:*/
       // LocalDate d = new LocalDate(); // DOES NOT COMPILE

       // see what happens when you pass invalid numbers to of(). For example:
        LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException


    }
}
