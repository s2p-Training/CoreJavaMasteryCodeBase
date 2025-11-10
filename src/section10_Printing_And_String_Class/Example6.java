package section10_Printing_And_String_Class;

public class Example6
{
    public static void main(String[] args) {

        // Understanding The Flags And Width
        // %[argument_index][flags][width][.PRECISION]CONVERSION
        // flag: -, +, 0, ( , ' '

        // Understanding The Width Parameter
        int x = 12;
        System.out.printf("%5d\n", x);

        // Understanding the 0 flag with width
        System.out.printf("%05d\n",x);

        // Understanding the ( flag with width
        int x1 = -10;
        System.out.printf("%7d\n",x1);
        System.out.printf("%(7d\n", x1);

        // Understanding the + flag with width
        int y1 = 10;
        int y2 = -10;
        System.out.printf("%+5d\n", y1);
        System.out.printf("%+5d\n", y2);

        // Understanding the - flag with width
        // Starts printing the number from Left-Right with trailing spaces.
        int a = 17;
        int b = 12;

        System.out.printf("%-5d\n",a);
        System.out.printf("%-3d\n",b);
    }
}
