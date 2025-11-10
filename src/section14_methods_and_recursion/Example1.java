package section14_methods_and_recursion;

public class Example1
{
    static int getMax(int n, int m)
    {
        if(m > n)
        {
            return  m;
        }
        else
        {
            return n;
        }
    }

    public static void main(String[] args)
    {
        int num1    = 12;
        int num2    = 34;
        int maxNum  = getMax(num1, num2);

        System.out.println("Maximum Number : " + maxNum);

        int a       = 99;
        int b       = 10;
        int c       = getMax(a,b);

        System.out.println("Maximum Number : " + c);

    }
}
