package section31_Date_Time_API;

import java.time.LocalTime;

public class Example6
{
    public static void main(String[] args)
    {
        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);

        LocalTime localTime2 = localTime1.plusHours(1);
        System.out.println(localTime2);
    }
}
