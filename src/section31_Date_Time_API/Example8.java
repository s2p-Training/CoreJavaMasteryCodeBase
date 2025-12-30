package section31_Date_Time_API;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

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

    }
}
