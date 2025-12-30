package section12_Iterative_Statements;

import java.util.Scanner;

public class Example1
{
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String message = null;


        do {
            System.out.println("Press Q To Exit");
            message = Input.next();
        }while (!message.equals("Q"));

    }
}
