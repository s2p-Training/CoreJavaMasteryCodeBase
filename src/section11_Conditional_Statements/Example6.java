package section11_Conditional_Statements;

import java.util.Scanner;

public class Example6
{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter the value of a : ");
        a = Input.nextInt();

        System.out.println("Enter the value of b : ");
        b = Input.nextInt();

        System.out.println("Enter the value of c : ");
        c = Input.nextInt();

        if(a > b && a > c)
        {
            System.out.println(a + " Is the largest");
        }
        else if(b > c)
        {
            System.out.println(b + " Is the largest");
        }
        else
        {
            System.out.println(c + " Is the largest");
        }

    }
}
