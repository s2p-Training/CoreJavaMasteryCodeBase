package section15_OOP_Encapsulation_And_Abstraction;

class Triangle
{
    // Fields
    float a;
    float b;
    float c;

    // Member Functions
    float perimeter()
    {
        float p = a + b + c;
        return p;
    }

    float area()
    {
        float s = perimeter() / 2;
        float res =  (float)Math.sqrt(s * (s-a) * ( s-b) * (s-c));
        return res;
    }

}


public class Example4
{
    public static void main(String[] args)
    {
        Triangle t1 = new Triangle();
        t1.a = 10;
        t1.b = 12;
        t1.c = 13;

        System.out.println(t1.perimeter());
        System.out.println(t1.area());
    }
}
