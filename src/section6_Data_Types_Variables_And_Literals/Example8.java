package section6_Data_Types_Variables_And_Literals;

public class Example8
{
    public static void main(String[] args) {

        // Character Wrapper Class
        System.out.println("Minimum Value Stored Inside The Character Data Type : " + (int) Character.MIN_VALUE);
        System.out.println("Maximum Value Stored Inside The Character Data Type : " + (int) Character.MAX_VALUE);
        System.out.println("Size For Character Data Type In Bits  : " + Character.SIZE);
        System.out.println("Size For Character Data Type In Bytes : " + Character.BYTES);

        Character c1 = 'A';
        System.out.println("Character Value : " + c1);

        char c2 = 'a';

        // Check Character Type
        boolean isLetter = Character.isLetter(c2);
        System.out.println("Is Letter : " + isLetter);

        boolean isDigit = Character.isDigit(c2);
        System.out.println("Is Digit : " + isDigit);

        boolean isUpperCase = Character.isUpperCase(c2);
        System.out.println("Is UpperCase : " + isUpperCase);

        boolean isLowerCase = Character.isLowerCase(c2);
        System.out.println("Is LowerCase : " + isLowerCase);

        // Conversion
        char upper = Character.toUpperCase(c2);
        System.out.println("Upper Case Of a : " + upper);

        char lower = Character.toLowerCase('B');
        System.out.println("Lower Case Of B : " + lower);

        // Numeric Value
        int numericValue = Character.getNumericValue('9');
        System.out.println("Numeric Value Of '9' : " + numericValue);

        // Whitespace Check
        boolean isWhitespace = Character.isWhitespace(' ');
        System.out.println("Is Whitespace : " + isWhitespace);

        // Unicode Value
        int unicode = (int) c2;
        System.out.println("Unicode Value Of Character : " + unicode);

        // Java Character Supports Unicode
        // So We Can Store Symbols Of Different Natural Languages

        char english = 'A';
        char hindi = 'अ';
        char marathi = 'क';
        char chinese = '你';

        System.out.println("English Character : " + english);
        System.out.println("Hindi Character   : " + hindi);
        System.out.println("Marathi Character : " + marathi);
        System.out.println("Chinese Character : " + chinese);

        // Unicode Value Of Characters
        System.out.println("\nUnicode Values");

        System.out.println("Unicode Of English A : " + (int) english);
        System.out.println("Unicode Of Hindi अ   : " + (int) hindi);
        System.out.println("Unicode Of Marathi क : " + (int) marathi);
        System.out.println("Unicode Of Chinese 你 : " + (int) chinese);

        // Storing Directly Unicode Values Inside The Character Data Type
        char unicode1 = '\u0041';   // A
        char unicode2   = '\u0905';   // अ
        char unicode3 = '\u0915';   // क
        char unicode4   = '\u20B9';   // ₹
        char unicode5   = '\u263A';   // ☺

        System.out.println("English Character : " + unicode1);
        System.out.println("Hindi Character   : " + unicode2);
        System.out.println("Marathi Character : " + unicode3);
        System.out.println("Rupee Symbol      : " + unicode4);
        System.out.println("Smile Symbol      : " + unicode5);

    }
}
