package section6_Data_Types_Variables_And_Literals;

public class Example6
{
    public static void main(String[] args) {

        // This Gives Arithmetic Division By Zero Exception
        /*
        int a = 10;
        int b = 0;
        int c = a/b;
        System.out.println(c);
         */

        // Floating Point Numbers Can Represent Infinity
        float f1 = 10f;
        float f2 = 0f;
        float f3 = f1/f2;
        System.out.println(f3);

        f1 = -10f;
        f3 = f1/f2;
        System.out.println(f3);

        f1 = 0f;
        f2 = 0f;
        f3 = f1/f2;
        System.out.println(f3);

        // Float Wrapper Class
        System.out.println("Minimum Value Stored Inside The Float Data Type : " + Float.MIN_VALUE);
        System.out.println("Maximum Value Stored Inside The Float Data Type : " + Float.MAX_VALUE);
        System.out.println("Size For Float Data Type In Bits  : " + Float.SIZE);
        System.out.println("Size For Float Data Type In Bytes : " + Float.BYTES);

        Float n1 = 18000.55f;
        System.out.println(n1);

        float n2 = 1200.52f;
        float n3 = 1200.53f;
        int result = Float.compare(n2, n3);
        System.out.println("Compare : " + result);

        // Conversion Of String Data Into Primitive Type Is Known As Parsing
        float n4 = Float.parseFloat("1233.33");
        System.out.println(n4);

        // More About Float Wrapper Class
        float n5 = 27.75f;

        // Check Special Float Values
        System.out.println("Is NaN : " + Float.isNaN(n5));
        System.out.println("Is Infinite : " + Float.isInfinite(n5));
        System.out.println("Is Finite : " + Float.isFinite(n5));

        // Convert Float To String
        String floatString = Float.toString(n5);
        System.out.println("Float To String : " + floatString);

        // Convert Float To Hexadecimal Representation
        String hexForm = Float.toHexString(n5);
        System.out.println("Hexadecimal Form Of 27.75 : " + hexForm);

        // Convert Float To Raw Int Bits (IEEE 754 representation)
        int rawBits = Float.floatToIntBits(n5);
        System.out.println("Raw Bit Representation : " + rawBits);

    }
}
