package section10_Printing_And_String_Class;

public class Example14
{
    public static void main(String[] args) {

        String sData = "S2PJava";
        byte[] nums = sData.getBytes();

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
    }
}
