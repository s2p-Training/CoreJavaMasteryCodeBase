package section13_Introduction_To_Arrays;

public class Example10
{
    // Shifting Array Elements To Left By K Times
    public static void main(String[] args) {
        int[] nums = {10,12,2,8,9};
        int temp;

        int k = 3;

        // Performing Left Shifting K Times
        for(int j = 0; j < k; j++)
        {
            // Copying The First Element To Temp
            temp = nums[0];

            // Shifting Elements To Left
            for(int i=1; i < nums.length; i++)
            {
                nums[i-1] = nums[i];
            }

            // Copying Temp To Last Position Of An Array
            nums[nums.length -1] = temp;
        }

        // Printing Array After Shifting
        for(int i=0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
