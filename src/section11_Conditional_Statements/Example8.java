package section11_Conditional_Statements;

import java.util.Scanner;

public class Example8
{
    // Find Person Is Young Or Not Young
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        int personAge;

        System.out.println("Enter the age of person : ");
        personAge = Input.nextInt();

        if(personAge >= 14 && personAge <= 55)
        {
            System.out.println("Young");
        }
        else
        {
            System.out.println("Not Young");
        }

    }
}
