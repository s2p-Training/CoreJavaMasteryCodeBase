package section6_Data_Types_Variables_And_Literals;

public class Example5
{
    public static void main(String[] args)
    {
        // Long Wrapper Class
        System.out.println("Minimum Value Stored Inside The Long Data Type : " + Long.MIN_VALUE);
        System.out.println("Maximum Value Stored Inside The Long Data Type : " + Long.MAX_VALUE);
        System.out.println("Size For Long Data Type In Bits  : " + Long.SIZE);
        System.out.println("Size For Long Data Type In Bytes : " + Long.BYTES);

        Long n1 = 18000000000L;
        System.out.println(n1);

        long n2 = 1200L;
        long n3 = 1200L;
        int result = Long.compare(n2, n3);
        System.out.println("Difference : " + result);

        // Conversion Of String Data Into Primitive Type Is Known As Parsing
        long n4 = Long.parseLong("12333333333");
        System.out.println(n4);

        // More About Long Wrapper Class
        long n5 = 27L;

        // Counts The Number Of 1s Bit In Binary Representation
        int nActiveBits = Long.bitCount(n5);
        System.out.println("Number Of Active Bits : " + nActiveBits);

        // Returns The Lowest Bit Value
        long lowestBitValue = Long.lowestOneBit(n5);
        System.out.println("Lowest Bit Value : " + lowestBitValue);

        // Returns The Highest Bit Value
        long highestBitValue = Long.highestOneBit(n5);
        System.out.println("Highest Bit Value : " + highestBitValue);

        // Conversion to Different Number Systems
        String binaryForm = Long.toBinaryString(n5);
        System.out.println("Binary Form Of 27 : " + binaryForm);

        String octalForm = Long.toOctalString(n5);
        System.out.println("Octal Form Of 27 : " + octalForm);

        String hexForm = Long.toHexString(n5);
        System.out.println("Hex-Decimal Form Of 27 : " + hexForm);
    }
}
