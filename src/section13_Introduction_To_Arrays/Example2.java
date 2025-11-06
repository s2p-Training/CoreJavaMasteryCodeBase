package section13_Introduction_To_Arrays;

public class Example2
{
    public static void main(String[] args) {
        // Accessing Array Elements
        int[] nums = {10,20,30,40,50};

        // We Can Access Array Elements With Index
        System.out.println(nums[0]);
        System.out.println(nums[2]);

        // Access First Element Of An Array
        System.out.println(nums[0]);

        // Access Last Element Of An Array
        System.out.println(nums[nums.length-1]);

        // Access Middle Element Of An Array
        int middleIndex = (nums.length - 1)/2;
        System.out.println(nums[middleIndex]);

        // Changing Array Element With The Help Of Index
        int[] numbers = {10,20,30,40,50};
        System.out.println(numbers[3]);
        numbers[3] = -40;
        System.out.println(numbers[3]);
    }
}
