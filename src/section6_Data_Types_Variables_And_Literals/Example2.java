package section6_Data_Types_Variables_And_Literals;

public class Example2
{
    public static void main(String[] args)
    {
        // Introduction To Wrapper Classes

        // Byte Wrapper Class
        System.out.println("Minimum Value Stored Inside The Byte Data Type : " + Byte.MIN_VALUE);
        System.out.println("Maximum Value Stored Inside The Byte Data Type : " + Byte.MAX_VALUE);
        System.out.println("Size For Byte Data Type In Bits  : " + Byte.SIZE);
        System.out.println("Size For Byte Data Type In Bytes : " + Byte.BYTES);

        // Using Byte Wrapper Class Reference

        Byte b1 = null;
        b1 = Byte.parseByte("65");
        System.out.println(b1);

        Byte b2 = 16;
        Byte b3 = 19;

        int result = Byte.compare(b2,b3);
        System.out.println("Difference : " + result);

    }
}