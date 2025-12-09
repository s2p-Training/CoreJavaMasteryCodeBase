package section11_Conditional_Statements;

public class Example1
{
    // Relational Operators Are Used For Comparing The Data.
    // Relational Operators Are Used To Create A Condition.
    // Condition is a piece of code which evaluates to either true or false value.
    public static void main(String[] args)
    {

        int a = 5;
        int b = 10;
        int c = 15;

        // Relational Operators Returns Boolean Value
        boolean result = a > b;
        System.out.println(result);

        result = b < c;
        System.out.println(result);

        result = a == c;
        System.out.println(result);

        result = a <= c;
        System.out.println(result);

        result = a >= c;
        System.out.println(result);

        result = a!=b;
        System.out.println(result);

    }
}
