package section31_Date_Time_API;

import java.time.Duration;
import java.time.Instant;

public class Example11
{
    public static void main(String[] args) {

        Instant start = Instant.now();

        System.out.println("Code Started At : " + start.toEpochMilli());

        // Process Which Is Taking Some Time
        int i = 10000;
        while (i>0)
        {
            i--;
//            System.out.println(i);
        }


        Instant end   = Instant.now();

        System.out.println("Code Finished At : " + end.toEpochMilli());

        Duration duration =  Duration.between(start,end);
        System.out.println("Code Took : " + duration.toMillis());
    }
}
