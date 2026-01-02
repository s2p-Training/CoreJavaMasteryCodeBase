package section20_OOP_Static_And_Final_Keyword;

class Test2
{
    static int x;

    static
    {
        System.out.println("Block-1");
        x = 10;
    }

    static
    {
        System.out.println("Block-2");
        x = 100;
    }

}

public class Example3
{
    public static void main(String[] args) throws ClassNotFoundException {


        System.out.println("Main");
        Test2 t1 = new Test2();
//        Class.forName("section20_OOP_Static_And_Final_Keyword.Test2");
    }
}
