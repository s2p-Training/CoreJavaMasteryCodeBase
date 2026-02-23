package section6_Data_Types_Variables_And_Literals;

public class Example4
{
    public static void main(String[] args)
    {
        // Integer Wrapper Class
        System.out.println("Minimum Value Stored Inside The Integer Data Type : " + Integer.MIN_VALUE);
        System.out.println("Maximum Value Stored Inside The Integer Data Type : " + Integer.MAX_VALUE);
        System.out.println("Size For Integer Data Type In Bits  : " + Integer.SIZE);
        System.out.println("Size For Integer Data Type In Bytes : " + Integer.BYTES);

        Integer n1 = 18000;
        System.out.println(n1);

        int n2 = 1200;
        int n3 = 1200;
        int result = Integer.compare(n2,n3);
        System.out.println("Difference : " + result);

        // Conversion Of String Data Into Primitive Type Is Known As Parsing
        int n4 = Integer.parseInt("123333");
        System.out.println(n4);

        // More About Integer Wrapper Class
        int n5 = 27;

        // Counts The Number Of 1s Bit In Byte Array
        int nActiveBits  = Integer.bitCount(n5);
        System.out.println("Number Of Active Bits : " + nActiveBits);

        // Returns The Lowest Bit Value
        int lowestBitValue = Integer.lowestOneBit(n5);
        System.out.println("Lowest Bit Value : " + lowestBitValue);

        int highestBitValue = Integer.highestOneBit(n5);
        System.out.println("Highest Bit Value : " + highestBitValue);

        String binaryForm =  Integer.toBinaryString(n5);
        System.out.println("Binary Form Of 27 : " + binaryForm);

        String octalForm = Integer.toOctalString(n5);
        System.out.println("Octal Form Of 27 : " + octalForm);

        String hexForm = Integer.toHexString(n5);
        System.out.println("Hex-Decimal Form Of 27 : " + hexForm);
    }
}