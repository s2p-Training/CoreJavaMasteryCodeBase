package section6_Data_Types_Variables_And_Literals;

public class Example7
{
    public static void main(String[] args) {

        // Double Wrapper Class
        System.out.println("Minimum Value Stored Inside The Double Data Type : " + Double.MIN_VALUE);
        System.out.println("Maximum Value Stored Inside The Double Data Type : " + Double.MAX_VALUE);
        System.out.println("Size For Double Data Type In Bits  : " + Double.SIZE);
        System.out.println("Size For Double Data Type In Bytes : " + Double.BYTES);

        Double n1 = 18000.558899;
        System.out.println(n1);

        double n2 = 1200.55;
        double n3 = 1200.55;
        int result = Double.compare(n2, n3);
        System.out.println("Difference : " + result);

        // Conversion Of String Data Into Primitive Type Is Known As Parsing
        double n4 = Double.parseDouble("123333.789");
        System.out.println(n4);

        // More About Double Wrapper Class
        double n5 = 27.75;

        // Check Special Double Values
        System.out.println("Is NaN : " + Double.isNaN(n5));
        System.out.println("Is Infinite : " + Double.isInfinite(n5));
        System.out.println("Is Finite : " + Double.isFinite(n5));

        // Convert Double To String
        String doubleString = Double.toString(n5);
        System.out.println("Double To String : " + doubleString);

        // Convert Double To Hexadecimal Representation
        String hexForm = Double.toHexString(n5);
        System.out.println("Hexadecimal Form Of 27.75 : " + hexForm);

        // Convert Double To Raw Long Bits (IEEE 754 representation)
        long rawBits = Double.doubleToLongBits(n5);
        System.out.println("Raw Bit Representation : " + rawBits);
    }
}
