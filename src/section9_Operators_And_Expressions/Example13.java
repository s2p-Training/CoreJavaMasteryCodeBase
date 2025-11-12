package section9_Operators_And_Expressions;

public class Example13
{
    public static void main(String[] args) {

        int x = 10;
        int y = 6;
        int z;

        System.out.println("Bitwise AND Operation : ");
        z = x & y;
        System.out.println(z);

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(z));

        System.out.println("Bitwise OR Operation : ");
        z = x | y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));

        System.out.println("Bitwise XOR Operation : ");
        z = x ^ y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));

        System.out.println("Bitwise NOT Operation");
        System.out.printf("%32s\n", Integer.toBinaryString(x));
        z = ~x;
        System.out.printf("%32s\n", Integer.toBinaryString(z));

    }
}
