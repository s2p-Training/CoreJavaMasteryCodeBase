package section11_Conditional_Statements;

import java.util.Scanner;

// Student Challenge: Find Radix Of The Given String
public class Example10
{
    public static void main(String[] args) {

        String sData = null;
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the number : ");
        sData  = Input.next();

        if(sData.matches("[0-1]+"))
        {
            System.out.println("Binary Number System");
            System.out.println("Radix : 2");
        }
        else if(sData.matches("[0-7]+"))
        {
            System.out.println("Octal Number System");
            System.out.println("Radix : 7");
        }
        else if(sData.matches("[0-9]+"))
        {
            System.out.println("Decimal Number System");
            System.out.println("Radix : 10");
        }
        else if(sData.matches("[0-9A-F]+"))
        {
            System.out.println("Hexadecimal Number System");
            System.out.println("Radix : 16");
        }

        Input.close();
    }
}
