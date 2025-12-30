package section31_Date_Time_API;

import java.time.LocalDateTime;

public class Example7
{
    public static void main(String[] args) {
        // LocalDateTime Class will contain information about date and time
        // without containing the information about the timeZone
        // Time-Zone information is not available inside the object of LocalDateTime class.
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        LocalDateTime localDateTime1 =  localDateTime.plusDays(2).plusMinutes(30);
        System.out.println(localDateTime1);

    }
}
