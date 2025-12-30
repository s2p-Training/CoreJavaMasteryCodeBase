package section19_OOP_Inner_Class;

abstract class My
{
    public abstract void display();
}

class Outer3
{
    public void method1()
    {
        My instance = new My()
        {
            public void display()
            {
                System.out.println("Hello People");
            }
        };

        instance.display();
    }
}

public class Example3
{
    public static void main(String[] args)
    {
        Outer3 outer3 = new Outer3();
        outer3.method1();
    }
}
