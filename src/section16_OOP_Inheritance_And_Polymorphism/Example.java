package section16_OOP_Inheritance_And_Polymorphism;

class Super
{
    public void display()
    {
        System.out.println("Hello");
    }
}

class Sub extends Super
{
    public void display()
    {
        System.out.println("Hello Welcome");
    }
}

public class Example
{
    public static void main(String[] args)
    {
        Super su = new Super();
        su.display();

        Sub sub = new Sub();
        sub.display();
    }
}
