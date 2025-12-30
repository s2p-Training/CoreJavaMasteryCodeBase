package section31_Date_Time_API;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example12
{
    public static void main(String[] args)
    {
        // Date Time Formatter
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.parse("2025/05/17", formatter1);
        System.out.println(localDate);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyy");
        localDate = LocalDate.parse("17/05/2002",formatter2);
        System.out.println(localDate);
    }
}
