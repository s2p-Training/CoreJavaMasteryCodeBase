package section6_Data_Types_Variables_And_Literals;

public class Example10
{
    public static void main(String[] args) {
        // Integer Data Formatting

        // Binary Literal
        int x = 0b101010;
        System.out.println("Binary Value : " + x);

        // Hexadecimal Literal
        int y = 0xffd500;
        System.out.println("Hexadecimal Value : " + y);

        // Octal Literal
        int z = 0734;
        System.out.println("Octal Value : " + z);

        // Underscore Formatting (for readability)
        int n1 = 10_00_000;
        System.out.println("Formatted Integer Value : " + n1);

        // Float Data Formatting

        // Normal Float
        float a = 12.34f;
        System.out.println("Normal Float : " + a);

        // Underscore Formatting
        float b = 1_234.567_8f;
        System.out.println("Formatted Float : " + b);

        // Scientific Notation
        float c = 3.14e2f;
        System.out.println("Scientific Notation : " + c);

        // Small Scientific Notation
        float d = 5.67e-3f;
        System.out.println("Small Scientific Notation : " + d);
    }
}
