package section14_methods_and_recursion;

public class Example8
{

    static void foo(int x)
    {
        if(x > 0)
        {
            System.out.println(x);
            foo(x-1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Start");
        foo(5);
        System.out.println("End");
    }
}
