package section11_Conditional_Statements;

import java.util.Scanner;

public class Example3
{
    public static void main(String[] args)
    {
        System.out.println("Start Of Program");

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter The Number : ");
        int number = Input.nextInt();

        if(number > 0)
        {
            System.out.println( number + " Is A Positive Number");
        }

        System.out.println(number + " Is A Real Number");
        System.out.println("End Of Program");

    }
}
