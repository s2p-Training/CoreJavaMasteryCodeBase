package section13_Introduction_To_Arrays;

import java.util.Arrays;

public class Example13
{
    // Understanding The Binary Search
    public static void main(String[] args)
    {
        int[] nums = {8,12,6,10,1,3,2};

        // Binary Search Works On Sorted Array
        Arrays.sort(nums);

        int foundIndex = -1;

        int key = 3;
        int low = 0;
        int high = nums.length-1;
        int mid;

        while (low <= high)
        {
            mid = (low + high)/2;

            if(nums[mid] == key)
            {
                foundIndex = mid;
                break;
            }
            else if(nums[mid] > key)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        System.out.println("Key Found At : " + foundIndex);

    }
}
