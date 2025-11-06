package section13_Introduction_To_Arrays;

import java.util.Arrays;

public class Example14
{
    public static void main(String[] args) {

        int[] nums = {8,12,6,10,1,3,2};

        // Binary Search Works On Sorted Array
        Arrays.sort(nums);

        int foundIndex = Arrays.binarySearch(nums,3);
        System.out.println("Key Found At : " + foundIndex);

        foundIndex = Arrays.binarySearch(nums,67);
        System.out.println("Key Found At : " + foundIndex);

    }
}
