package section13_Introduction_To_Arrays;

public class Example1
{
    public static void main(String[] args)
    {
        // Syntax To Create Arrays
        // length property is used to access the size of an array.

        // 1. Creating Array Using Element List
        int[] nums1 = {1,2,3,4,5};
        System.out.println(nums1.length);

        // 2. Creating Array Using New Keyword
        int[] nums2 = new int[10];
        System.out.println(nums2.length);

        // 3. Creating Array Using New Keyword And Element List
        int[] nums3 = new int[]{1,2,3,4,5,6,7};
        System.out.println(nums3.length);
    }
}
