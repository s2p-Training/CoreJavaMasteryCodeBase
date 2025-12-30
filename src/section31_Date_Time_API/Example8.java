package section31_Date_Time_API;

import java.time.*;

public class Example8
{
    public static void main(String[] args)
    {
        ZonedDateTime zdt = ZonedDateTime.now();

        System.out.println("ZonedDateTime Object Properties And Features ---");
        System.out.println(zdt);
        System.out.println(zdt.getZone().getId());
        System.out.println(zdt.getOffset().getId());

        OffsetDateTime odt = OffsetDateTime.now();

        System.out.println("OffsetDateTime Object Properties And Features ---");

        System.out.println(odt);
        System.out.println("Offset Time : " + odt.getOffset().getId());

        System.out.println("Seconds : " + odt.getSecond());
        System.out.println("Nano-Seconds : " + odt.getNano());

        System.out.println("ZoneId Object Properties And Features ---");
        ZoneId zid = ZoneId.of("America/Phoenix");
        System.out.println("Zone Id : " + zid);
        System.out.println("Zone Id : " + zid.getId());

        System.out.println("MonthDay Object Properties And Features ---");
        MonthDay monthDay = MonthDay.now();
        System.out.println(monthDay);
        System.out.println("Month : " + monthDay.getMonth());
        System.out.println("Day   : " + monthDay.getDayOfMonth());

        Year year = Year.now();
        System.out.println("Year : " + year.getValue());

    }
}
