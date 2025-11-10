package section10_Printing_And_String_Class;

public class Example4
{
    public static void main(String[] args)
    {
        /*
            Method Signature:
                System.printf(CONTROL_STRING, PARAMETERS)

            1. This method is used to write the formated String to output stream or console
            using format-string and variable arguments.

            2. printf( ) method compulsorily takes format string, and it can take 0 more
            variable arguments.
         */

        // 1. Format String And 0 Variable Arguments
        System.out.printf("Hello");

        // 2. Taking Format String And 1 Or More Variable Arguments
        int x = 17;

        System.out.printf("My Fav Number Is %d \n", x);

        int y = 10;
        float fn = 10.0f;
        char c = 'A';

        System.out.printf("%d %f %c \n", y, fn, c);

    }
}
