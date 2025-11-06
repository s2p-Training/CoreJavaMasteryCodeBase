package section13_Introduction_To_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example11
{
    // Finding Sum Of Array Elements
    public static void main(String[] args)
    {
        int[] nums = {5,8,3,4,6,1,10};
        int sum = 0;

        for(int i=0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }

        System.out.println("Sum Of Array Elements : " + sum);

    }
}
