package section11_Conditional_Statements;

import java.util.Scanner;

public class Example4
{
    public static void main(String[] args)
    {
        System.out.println("Start Of Program");

        Scanner Input = new Scanner(System.in);
        int number    = Input.nextInt();

        if(number > 0)
        {
            System.out.println(number + " Is A Positive Number");
        }
        else
        {
            System.out.println(number + " Is A Negative Number");
        }

        System.out.println(number + " Is A Real Number");
    }
}
