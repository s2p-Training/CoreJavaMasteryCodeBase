package section31_Date_Time_API;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

// Joda Date And Time API
// LocalDate
// LocalTime
// LocalDateTime
// Instant
public class Example5
{
    public static void main(String[] args)
    {
        // 1. Date object represents the time in milliseconds
        // 2. Date object keep track of time from 1 Jan 1970
        // 3. Date object contains both date and time
        // 4. Date object is mutable

        // LocalDate, LocalTime And LocalDateTime class represent the time in the form seconds and nanoseconds
        // Also represent the time from 1st Jan 1970
        // These classes are Immutable. (Loosely Immutable)

        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        localDate = LocalDate.now(ZoneId.of("America/Phoenix"));
        System.out.println(localDate);

        localDate = LocalDate.of(2026, Month.MAY,17);
        System.out.println(localDate);

        localDate = LocalDate.ofEpochDay(1);
        System.out.println(localDate);

        localDate = LocalDate.parse("2020-05-17"); // YYYY-MM-DD
        System.out.println(localDate);

        // When We Modify The LocalDate Object, JVM will create the separate object
        // and performs changes on new object.
        LocalDate localDate1 = localDate.plusDays(3);
        System.out.println(localDate1);

    }
}
