package section31_Date_Time_API;

import java.util.Date;

// Old Date Class In Java
public class Example2
{
    public static void main(String[] args)
    {
        // This Object Will Contain Current Date And Time As It Is Based On Milliseconds
        Date date = new Date();
        System.out.println(date);

        date = new Date(System.currentTimeMillis());
        System.out.println(date);

        date = new Date("1/1/1970");
        System.out.println(date);

        date = new Date(); // Current Date And Time
        System.out.println(date.getDay()); // Day Of A Week Starts From 0. 0 Means Sunday... 1 Means Monday

        date = new Date("7/26/2020"); // MM/DD/YYYY
        System.out.println(date.getDay()); // 0 Means Sunday

        System.out.println(date.getMonth()); // 0 Jan, 1 Feb, 2 March
        System.out.println(date.getYear() + 1900); // Returns the number of years passed from the 1900

    }
}
