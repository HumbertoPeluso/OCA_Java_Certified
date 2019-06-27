package chapterthree.corejavaapis.workingwithdatesandtimes;

import java.time.*;

public class WorkingWithPeriods {
    public static void main(String[] args) {
        /*Now we know enough to do something fun with dates! Our zoo performs animal enrichment activities to give the animals something fun to do. The head zookeeper has decided
        to switch the toys every month. This system will continue for three months to see how it
        works out.*/

        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, end);
        /*This code works fi ne. It adds a month to the date until it hits the end date. The problem
        is that this method can’t be reused.*/

       /* Luckily, Java has a Period class that we can pass in. This code does the same thing as
        the previous example:*/
        LocalDate start2 = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end2 = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); // create a period
        performAnimalEnrichment2(start2, end2, period);
       /* The method can add an arbitrary period of time that gets passed in. This allows us to
        reuse the same method for different periods of time as our zookeeper changes her mind*/

     //   There are fi ve ways to create a Period class:
        Period annually = Period.ofYears(1); // every 1 year
        Period quarterly = Period.ofMonths(3); // every 3 months
        Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        Period everyOtherDay = Period.ofDays(2); // every 2 days
        Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

        /*There’s one catch. You cannot chain methods when creating a Period. The following
        code looks like it is equivalent to the everyYearAndAWeek example, but it’s not. Only the
        last method is used because the Period.ofXXX methods are static methods.*/
        Period wrong = Period.ofYears(1).ofWeeks(1); // every week
       // This tricky code is really like writing the following:
        Period wrong2 = Period.ofYears(1);
        wrong2 = Period.ofWeeks(7);

       /* The last thing to know about Period is what objects it can be used with. Let’s look at
        some code:*/
         LocalDate date = LocalDate.of(2015, 1, 20);
         LocalTime time = LocalTime.of(6, 15);
         LocalDateTime dateTime = LocalDateTime.of(date, time);
         Period period2 = Period.ofMonths(1);
         System.out.println(date.plus(period2)); // 2015-02-20
         System.out.println(dateTime.plus(period2)); // 2015-02-20T06:15
         System.out.println(time.plus(period2)); // UnsupportedTemporalTypeException
       

    }

    private static void performAnimalEnrichment2(LocalDate start2, LocalDate end2, Period period) {
        LocalDate upTo = start2;
        while (upTo.isBefore(end2)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }
}
