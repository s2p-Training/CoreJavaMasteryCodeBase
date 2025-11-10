package section10_Printing_And_String_Class;

public class Example7
{
    // %[ARGUMENT_INDEX$][FLAG][WIDTH][.PRECISION]CONVERSION_CHAR
    // Understanding [.PRECISION]
    // Precision works only with float and double data type
    public static void main(String[] args)
    {
        float a = 123.456787f;

        System.out.printf("%f\n",a);
        System.out.printf("%.2f\n",a);
        System.out.printf("%.3f\n",a);
        System.out.printf("%.4f\n",a);

        double b = 1.1234567890123456789;
        System.out.printf("%f\n",b);
        System.out.printf("%.7f\n",b);
        System.out.printf("%.8f\n",b);
        System.out.printf("%.9f\n",b);
        System.out.printf("%.10f\n",b);
    }
}
