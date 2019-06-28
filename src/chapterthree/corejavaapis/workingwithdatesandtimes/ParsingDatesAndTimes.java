package chapterthree.corejavaapis.workingwithdatesandtimes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDatesAndTimes {
    public static void main(String[]args){
       /* Now that you know how to convert a date or time to a formatted String, you’ll fi nd it easy
        to convert a String to a date or time. Just like the format() method, the parse() method
        takes a formatter as well. If you don’t specify one, it uses the default for that type.*/
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", f);
        LocalTime time = LocalTime.parse("11:22");
        System.out.println(date); // 2015-01-02
        System.out.println(time); // 11:22
    }
}