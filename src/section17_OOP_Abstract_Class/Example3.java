package section17_OOP_Abstract_Class;

abstract class Super2
{
    public Super2()
    {
        System.out.println("Constructor Of Super2 Class");
    }

    public void method1()
    {
        System.out.println("Method-1 Of Super2 Class");
    }

    abstract public void method2();
}

public class Example3
{
    public static void main(String[] args) {
//        Super2 su2 = new Super2();
//        su2.method1();
//        su2.method2();
    }
}
