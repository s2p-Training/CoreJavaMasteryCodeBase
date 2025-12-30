package section10_Printing_And_String_Class;

public class Example10
{
    public static void main(String[] args)
    {

        // 1. Literal String
        String sData1 = "s2pedutech";
        System.out.println(sData1);

        // 2. Creating String Object From Literal String
        String sData2 = new String("s2pedutech");
        String sData3 = new String(sData1);
        System.out.println(sData2);
        System.out.println(sData3);

        // 3. Empty String
        String sData4 = new String();

        // 4. String From Character Array

        char[] chars = {'A','B','C','D'};
        String sData5 = new String(chars);
        System.out.println(sData5);

        // 5. String From Byte Array

        byte[] buffer = {97,98,99,100};
        String sData6 = new String(buffer);
        System.out.println(sData6);

    }
}
