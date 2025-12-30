package section31_Date_Time_API;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

// Exploring Time Zones
public class Example4
{
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();

        calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));

        TimeZone timeZone = calendar.getTimeZone();
        System.out.println(timeZone);

        System.out.println(timeZone.getDisplayName());
        System.out.println(timeZone.getID());

    }
}
