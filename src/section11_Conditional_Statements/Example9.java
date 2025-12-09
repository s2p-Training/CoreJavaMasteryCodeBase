package section11_Conditional_Statements;

import java.util.Scanner;

public class Example9
{
    // Find Grades For Given Marks
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);

        float m1;
        float m2;
        float m3;

        System.out.println("Enter the marks for subject 1 : ");
        m1 = Input.nextFloat();

        System.out.println("Enter the marks for subject 2 : ");
        m2 = Input.nextFloat();

        System.out.println("Enter the marks for subject 3 : ");
        m3 = Input.nextFloat();

        float avg = (m1 + m2 + m3)/3;

        System.out.println("Average : " + avg);

        if(avg >= 70)
        {
            System.out.println("Grade A");
        }
        else if(avg >= 60 && avg < 70)
        {
            System.out.println("Grade B");
        }
        else if(avg >= 50 && avg < 60)
        {
            System.out.println("Grade C");
        }
        else if(avg >= 40 && avg < 50)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Grade E");
        }
    }
}
