package section18_OOP_Interfaces;

interface ParentTest2
{
    void method1();
    void method2();
}

class ChildTest2 implements ParentTest2
{
    @Override
    public void method1() {
        System.out.println("Method-1 Of ChildTest2 Class");
    }

    @Override
    public void method2() {
        System.out.println("Method-2 Of ChildTest2 Class");
    }

    public void method3()
    {
        System.out.println("Method-3 Of ChildTest3 Class");
    }
}

public class Example2
{
    public static void main(String[] args)
    {
        ChildTest2 instance1 = new ChildTest2();
        instance1.method1();
        instance1.method2();
        instance1.method3();

        ParentTest2 instance2 = new ChildTest2();
        instance2.method1();
        instance2.method2();
    }
}
