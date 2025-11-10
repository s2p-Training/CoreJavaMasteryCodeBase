package section10_Printing_And_String_Class;

public class Example10
{
    public static void main(String[] args)
    {

        // 1. Literal String
        String sData1 = "s2pedutech";

        // 2. Creating String Object From Literal String
        String sData2 = new String("s2pedutech");
        String sData3 = new String(sData1);

        // 3. Empty String
        String sData4 = new String();

        // 4. String From Character Array
        char[] chars = {'A','B','C','D'};
        String sData5 = new String(chars);

        // 5. String From Byte Array
        byte[] nums = {97,98,99,100};
        String sData6 = new String(nums);

    }
}
