package section13_Introduction_To_Arrays;

public class Example4
{
    public static void main(String[] args)
    {
        int[] nums = new int[]{10,20,30,40};

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);

        for(int i=0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
