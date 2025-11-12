package section13_Introduction_To_Arrays;

import java.util.Arrays;

public class Example18
{
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4,5};

        System.out.println(Arrays.toString(nums1));

        // Example of mutable loop
        for(int i=0; i < nums1.length; i++)
        {
            nums1[i]++;
        }

        System.out.println(Arrays.toString(nums1));


        // Example on mutable loop
        int[] nums2 = {1,2,3,4,5};

        System.out.println(Arrays.toString(nums2));

        for(int t: nums2)
        {
            System.out.println(++t);
        }

        System.out.println(Arrays.toString(nums2));

    }
}
