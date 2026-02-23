package section15_OOP_Encapsulation_And_Abstraction;

/*
    1. Constructor is a method which will have same name as class name.
    2. A method must have return type, but the constructor will have any return type not even void.
    3. Usually we make constructor as public, even we can make them as private.
    4. There are two types of constructors we can write:
            1. Non-Parameterized Constructor
            2. Parameterized Constructor
    5. Non-Parameterized Constructor is a replacement for default constructor.
    6. Constructors can be overloaded, we can write down as many as constructor we want.
 */
class RectangleTest2
{
    private int length;
    private int breadth;

    public RectangleTest2()
    {
        length = 1;
        breadth = 1;
    }

    public RectangleTest2(int l, int b)
    {
        length = l;
        breadth = b;
    }

    public int area()
    {
        return  (length * breadth);
    }
}

public class Example9
{
    public static void main(String[] args)
    {
        RectangleTest2 r1 = new RectangleTest2();
        System.out.println(r1.area());

        RectangleTest2 r2 = new RectangleTest2(10,5);
        System.out.println(r2.area());
    }
}
