package section31_Date_Time_API;

import java.util.*;

// Exploring Old Java Date And Time Classes
public class Example1
{
    public static void main(String[] args)
    {
        // 1. Date Representation In Java As Long Number In Milliseconds passed from
        // 1st Jan 1970 till today's date and the current time
        // Java Follows the starting calendar year from 1900
        System.out.println(System.currentTimeMillis()); // Number of milliseconds passed after 1st Jan 1970

        long milliseconds = System.currentTimeMillis();
        long seconds  = milliseconds/1000;
        long minutes  = milliseconds/1000/60;
        long hours    = milliseconds/1000/60/60;
        long days     = milliseconds/1000/60/60/24;
        long years    = milliseconds/1000/60/60/24/365;

        System.out.println("Milliseconds : " + milliseconds);
        System.out.println("Seconds : " + seconds);
        System.out.println("Minutes : " + minutes);
        System.out.println("Hours   : " + hours);
        System.out.println("Days    : " + days);
        System.out.println("Years   : " + years);

        System.out.println(milliseconds);
        System.out.println(Long.MAX_VALUE);
    }
}
