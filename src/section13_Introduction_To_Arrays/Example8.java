package section13_Introduction_To_Arrays;

import java.util.Scanner;

public class Example8
{
    public static void main(String[] args)
    {
        // Writing Linear Search Algorithm
        int[] A = {12,9,7,19,33,54,8,2};
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter The Key : ");

        int key = Input.nextInt();

        int index = -1;  // Invalid Index

        for(int i=0; i < A.length; i++)
        {
            if(A[i] == key)
            {
                index = i;
                break;
            }
        }

        if(index != -1)
        {
            System.out.println("Key Found At Index : " + index);
        }
        else
        {
            System.out.println("Key Not Found : " + key);
        }

        Input.close();
    }
}
