package section31_Date_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Example9
{
    public static void main(String[] args)
    {
        LocalDate localDate1 = LocalDate.of(2025,12,12);
        LocalDate localDate2 = LocalDate.of(2025,12,30);

        Period p = Period.between(localDate1,localDate2);
        System.out.println(p.getDays());
        System.out.println(p.getMonths());
        System.out.println(p.getYears());

        LocalDate localDate3 = LocalDate.of(2002,5,17);
        LocalDate localDate4 = LocalDate.of(2025,12,30);
        Period p1 = Period.between(localDate3,localDate4);

        System.out.println(p1.getYears());
    }
}
