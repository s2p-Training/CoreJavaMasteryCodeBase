package section6_Data_Types_Variables_And_Literals;

public class Example3
{
    public static void main(String[] args)
    {
        // Short Wrapper Class
        System.out.println("Minimum Value Stored Inside The Short Data Type : " + Short.MIN_VALUE);
        System.out.println("Maximum Value Stored Inside The Short Data Type : " + Short.MAX_VALUE);
        System.out.println("Size For Short Data Type In Bits  : " + Short.SIZE);
        System.out.println("Size For Short Data Type In Bytes : " + Short.BYTES);

        Short s1 = 180;
        System.out.println(s1);

        short s2 = 1900;
        short s3 = 1894;
        int result = Short.compare(s2,s3);
        System.out.println("Difference : " + result);

        // Conversion Of String Data Into Primitive Type Is Known As Parsing
        short s4 = Short.parseShort("12356");
        System.out.println(s4);
    }
}