package section11_Conditional_Statements;

public class Example2
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;
        int c = 15;

        // Understanding Logical AND (&&) Operator
        boolean result = a < b && a < c;
        System.out.println(result);

        result = a > b && a < c;
        System.out.println(result);

        result = a > b && a > c;
        System.out.println(result);

        // Understanding Logical OR (||) Operator
        result = a < b || b > c;
        System.out.println(result);

        result = a > b || b > c;
        System.out.println(result);

        // Understanding Logical NOT (!) Operator
        result = !true;
        System.out.println(result);

        result = !false;
        System.out.println(result);

        result = !(a < b && a < c);
        System.out.println(result);

        result = !(a > b || b > c);
        System.out.println(result);

        result = !(a < b || b > c);
        System.out.println(result);
    }
}
