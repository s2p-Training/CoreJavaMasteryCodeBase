package section6_Data_Types_Variables_And_Literals;

public class Example9
{
    public static void main(String[] args) {
        System.out.println("True Constant  : " + Boolean.TRUE);
        System.out.println("False Constant : " + Boolean.FALSE);

        // Creating Boolean Object
        Boolean b1 = true;
        System.out.println("Boolean Object Value : " + b1);

        // Primitive Boolean
        boolean b2 = false;
        System.out.println("Primitive Boolean Value : " + b2);

        // Parsing String Into Boolean
        boolean parsedValue = Boolean.parseBoolean("true");
        System.out.println("Parsed Boolean Value : " + parsedValue);

        // valueOf() Method
        Boolean b3 = Boolean.valueOf("false");
        System.out.println("Boolean Value Using valueOf() : " + b3);

        // Comparison Between Two Boolean Values
        int result = Boolean.compare(true, false);
        System.out.println("Comparison Result : " + result);

        // Logical Operations Using Boolean Wrapper Methods
        boolean andResult = Boolean.logicalAnd(true, false);
        System.out.println("Logical AND Result : " + andResult);

        boolean orResult = Boolean.logicalOr(true, false);
        System.out.println("Logical OR Result : " + orResult);

        boolean xorResult = Boolean.logicalXor(true, false);
        System.out.println("Logical XOR Result : " + xorResult);

        // Converting Boolean To String
        String boolString = Boolean.toString(true);
        System.out.println("Boolean To String : " + boolString);

    }
}
