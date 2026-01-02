package section20_OOP_Static_And_Final_Keyword;

class Test4
{
    final int MIN = -999;
    static final int NORMAL;
    final int MAX;

    static
    {
        NORMAL = 12;
    }

    Test4()
    {
        MAX = 999;
    }

}

public class Example4
{
    public static void main(String[] args)
    {

    }
}
