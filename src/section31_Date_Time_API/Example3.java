package section31_Date_Time_API;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Exploring Calendar Class
// Calendar
public class Example3
{
    // Calendar is an abstract class
    // There are various calendars followed in the world.
    // Solar Calendars, Lunar Calendars, Arab Calendar.
    // Globally the calendar we follow is called Gregorian Calendar
    public static void main(String[] args)
    {
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println(calendar.isLeapYear(2025));
        System.out.println(calendar.isLeapYear(2020));

        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));


        calendar.set(2026, Calendar.JANUARY,1); // Calendar is mutable object. We can change the original object
        System.out.println(calendar.get(Calendar.YEAR)); // Year
        System.out.println(calendar.get(Calendar.MONTH)); // Month Starts from 0
        System.out.println(calendar.get(Calendar.DATE)); // Date


    }
}
