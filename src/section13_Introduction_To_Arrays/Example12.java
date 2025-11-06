package section13_Introduction_To_Arrays;

import java.util.Arrays;

public class Example12
{
    // Introduction To Arrays Utility Class
    public static void main(String[] args) {

        // Creating An Integer Array Of Size 10
        int[] nums = new int[10];

        // Prints Arrays In String Form Directly
        System.out.println(Arrays.toString(nums));

        // Fills An Array Elements With -1
        Arrays.fill(nums,-1);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{1,2,10,20,30,3};

        // Used to make the copy an array completely into new array with specified size
        int[] copyNums = Arrays.copyOf(nums,12);
        System.out.println(Arrays.toString(copyNums));

        // Used to make the copy of an array by specifying the starting point and ending point
        int[] cNums =  Arrays.copyOfRange(nums,0,3);
        System.out.println(Arrays.toString(cNums));

        // sort() Method Is Used To Sort The Array Elements In Ascending Order
        int[] nums1 = new int[]{10,3,8,1,5,11,4};

        System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums1); // Sorts The Original Array Element
        System.out.println(Arrays.toString(nums1));

        // Comparing Array Elements
        int[] A1 = new int[]{1,2,3,4,5};
        int[] A2 = new int[]{1,2,3,4,5};

        int isSame = Arrays.compare(A1,A2);
        System.out.println(isSame);

        int[] B1 = new int[]{1,2,3,4,5};
        int[] B2 = new int[]{3,4,5};
        isSame = Arrays.compare(B1,B2);
        System.out.println(isSame);
    }
}
