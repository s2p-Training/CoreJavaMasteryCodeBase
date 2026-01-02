package section20_OOP_Static_And_Final_Keyword;

class Test1
{
    int x = 10;
    static int y = 10;

    void method1()
    {
        System.out.println("Non Static Method Of A Class");
        System.out.println(x);
        System.out.println(y);
    }

    static void method2()
    {
        System.out.println("Static Method Of A Class");
        System.out.println(y);
    }
}


public class Example1
{
    public static void main(String[] args)
    {
        Test1 t1 = new Test1();
        t1.method1();
        t1.method2();
        t1.y = 1000;

        Test1 t2 = new Test1();
        t1.method2();

        System.out.println(Test1.y);
        Test1.method2();

    }
}
