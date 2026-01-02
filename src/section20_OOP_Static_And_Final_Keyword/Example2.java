package section20_OOP_Static_And_Final_Keyword;

public class Example2
{
    static int x;

    static
    {
        System.out.println("Block-1");
        x = 10;
    }

    public static void main(String[] args)
    {
        System.out.println("Main");
    }

    static
    {
        System.out.println("Block-2");
        x = 100;
    }
}
