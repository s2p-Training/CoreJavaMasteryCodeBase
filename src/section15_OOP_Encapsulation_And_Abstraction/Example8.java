package section15_OOP_Encapsulation_And_Abstraction;

// Constructors In Java
/*
    Constructor is a method of class which is automatically called
    whenever an object is created.

    Every class will have some default constructor provided by java compiler,
    If programmer is not any constructor.



    1. Default Constructor
    2. No-Argument Constructor (Parameterless Constructor)
    3. Parameterized Constructor
    4. All Argument Constructor
    5. Required Argument Constructor
    6. Private Constructor
    7. Copy Constructor
 */

class RectangleTest1
{
    private int length;
    private int breadth;

    public int area()
    {
        return  (length * breadth);
    }
}

public class Example8
{
    public static void main(String[] args)
    {
        //
        RectangleTest1 r1 = new RectangleTest1();
    }
}
