package section11_Conditional_Statements;

import java.util.Scanner;

public class Example13
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 6;
        int choice;

        Scanner input = new Scanner(System.in);

        System.out.println("Press 1 To Perform Addition");
        System.out.println("Press 2 To Perform Subtraction");
        System.out.println("Press 3 To Perform Multiplication");
        System.out.println("Press 4 To Perform Division");
        System.out.println("Enter Your Choice : ");

        choice =  input.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Performing Addition : " + (a+b));
                break;

            case 2:
                System.out.println("Performing Subtraction : " + (a+b));
                break;

            case 3:
                System.out.println("Performing Multiplication : " + (a+b));
                break;

            case 4:
                System.out.println("Performing Division : " + (a+b));
                break;

            default:
                System.out.println("Invalid Key Pressed ...");
                break;
        }

    }
}
