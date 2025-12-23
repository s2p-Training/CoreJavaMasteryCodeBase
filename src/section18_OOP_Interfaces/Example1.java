package section18_OOP_Interfaces;

abstract class ParentTest1
{
    abstract public void method1();
    abstract public void method2();
}

class ChildTest1 extends ParentTest1
{
    @Override
    public void method1() {
        System.out.println("Method-1 Of ChildTest1 class");
    }

    @Override
    public void method2() {
        System.out.println("Method-2 Of ChildTest2 class");
    }

    public void method3()
    {
        System.out.println("Method-3 Of ChildTest2 Class");
    }
}

public class Example1
{
    public static void main(String[] args)
    {
        ChildTest1 instance1 = new ChildTest1();
        instance1.method1();
        instance1.method2();
        instance1.method3();

        ParentTest1 instance2 = new ChildTest1();
        instance2.method1();
        instance2.method2();

    }
}
