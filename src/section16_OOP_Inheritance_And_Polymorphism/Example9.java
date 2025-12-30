package section16_OOP_Inheritance_And_Polymorphism;

class SuperClass
{
    public void method1()
    {
        System.out.println("Method-1 Of SuperClass");
    }

    public void method2()
    {
        System.out.println("Method-2 Of SuperClass");
    }
}

class SubClass extends SuperClass
{
    public void method3()
    {
        System.out.println("Method-3 Of SubClass");
    }

    @Override
    public void method2()
    {
        System.out.println("Method-2 Of SubClass");
    }

}

public class Example9
{
    public static void main(String[] args)
    {
        SuperClass super1 = new SuperClass();

        SubClass sub1 = new SubClass();

        sub1.method1();
        sub1.method2();
        sub1.method3();


    }
}
