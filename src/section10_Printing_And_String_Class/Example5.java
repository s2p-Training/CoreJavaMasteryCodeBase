package section10_Printing_And_String_Class;

public class Example5
{
    public static void main(String[] args)
    {
        /*
            printf([FORMAT-STRING], [ARGS])

            Format Specifier Anatomy
            %[argument_index][flags][width][.PRECISION]CONVERSION

            Format String Is Composed Of Control Characters Or Format Specifiers

            Format specifier are mentioned with modulo '%' symbol followed by control
            character

            % conversion
                c                       : Characters
                d, o, x                 : Decimal, Octal, Hexadecimal
                f, e, g                 : float, base-10, only fractional value
                s                       : String
                b                       : boolean

               [IMP] %f : works for both float and double.
         */

        /*
            Introduction To Argument Index: 1$, 2$, 3$
            n$ index of variable present inside variable argument list
            [Here Index Starts From 1 To N]
         */

        int x0 = -10;
        int x1 = 10;
        int x2 = 0;
        int x3 = 20;

        System.out.printf("%d %d %d %d \n",x0,x1,x2,x3);
        System.out.printf("%2$d %1$d %4$d %3$d \n",x0,x1,x2,x3);

    }
}
