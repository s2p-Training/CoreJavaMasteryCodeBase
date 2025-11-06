package section13_Introduction_To_Arrays;

public class Example6
{
    // Reverse Copying Array Elements
    public static void main(String[] args)
    {
        int[] nums      = {1,2,3,4,5,6,7,8,9};
        int[] revNums   = new int[nums.length];

        int size = nums.length;

        for(int i =0; i < revNums.length; i++)
        {
            revNums[i] = nums[size-1-i];
        }

        System.out.println("Array Elements After Reverse Copying");
        for(int i =0; i < revNums.length; i++)
        {
            System.out.println(revNums[i]);
        }

    }
}
