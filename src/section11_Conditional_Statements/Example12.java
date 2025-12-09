package section11_Conditional_Statements;

import java.util.Scanner;

public class Example12
{
    public static void main(String[] args) {

        System.out.println("Start Of Program");

        Scanner Input = new Scanner(System.in);

        int dayNumber;

        System.out.println("Enter the day number : ");

        dayNumber = Input.nextInt();

        if(dayNumber == 1)
        {
            System.out.println("Monday");
        }
        else if(dayNumber == 2)
        {
            System.out.println("Tuesday");
        }
        else if(dayNumber == 3)
        {
            System.out.println("Wednesday");
        }
        else if(dayNumber == 4)
        {
            System.out.println("Thursday");
        }
        else if(dayNumber == 5)
        {
            System.out.println("Friday");
        }
        else if(dayNumber == 6)
        {
            System.out.println("Saturday");
        }
        else if(dayNumber == 7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid Day Number");
        }

        Input.close();
        System.out.println("End Of Program");
    }
}
