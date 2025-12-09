package section11_Conditional_Statements;

import java.util.Scanner;

public class Example7
{
    // Find The Number Is Odd Or Even
    public static void main(String[] args)
    {
        System.out.println("Start Of Program");

        Scanner Input = new Scanner(System.in);
        int number;

        System.out.println("Enter the number value : ");
        number = Input.nextInt();

        if(number % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }

        System.out.println("End Of Program");

    }
}
