package section13_Introduction_To_Arrays;

import java.util.Scanner;

public class Example5
{
    public static void main(String[] args) {

        // Creating Array Of Size N And Reading The Array Elements
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter The Size Of Array : ");
        int nSize = Input.nextInt();

        int[] nums = new int[nSize];

        for(int i=0; i < nums.length; i++)
        {
            System.out.println("Enter The Number : ");
            nums[i] = Input.nextInt();
        }

        System.out.println("Array Elements : ");

        for(int i=0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }

        Input.close();
    }
}
