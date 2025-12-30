package section31_Date_Time_API;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.function.Supplier;

public class Example10
{
    public static void main(String[] args)
    {
        Duration duration1 = Duration.of(2, ChronoUnit.DAYS);
        System.out.println(duration1);

        LocalTime l1 = LocalTime.now();
        LocalTime l2 = l1.plusHours(17);

        Duration duration2 = Duration.between(l1,l2);
        System.out.println(duration2);

        Instant instant1 = Instant.now();

        System.out.println(instant1);
        System.out.println(instant1.toEpochMilli());

    }
}
