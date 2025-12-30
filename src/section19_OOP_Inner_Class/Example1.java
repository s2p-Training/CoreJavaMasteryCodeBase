package section19_OOP_Inner_Class;

// Example-1 Inner Class
class OuterClass1
{
    int x;

    class InnerClass1
    {
        int y = 20;

        public void innerDisplay()
        {
            // Inner class can access the members of outer class
            outerDisplay();
            System.out.println(x);
            System.out.println(y);
            System.out.println("Display Method Of Inner Class");
        }
    }


    public void outerDisplay()
    {
        // Outer Class Can Create The Object Of Inner Class
        // Inside It's Method
        System.out.println("Display Method Of OuterClass");
        InnerClass1 inner1 = new InnerClass1();

        // You can not access the features of inner class directly it
        // can be accessed via object of inner class
        inner1.innerDisplay();
        System.out.println(inner1.y);
    }
}

public class Example1
{
    public static void main(String[] args)
    {
        OuterClass1 outer1 = new OuterClass1();
        OuterClass1.InnerClass1 inner1 = outer1.new InnerClass1();

        OuterClass1.InnerClass1 inner2 = new OuterClass1().new InnerClass1();
    }
}
