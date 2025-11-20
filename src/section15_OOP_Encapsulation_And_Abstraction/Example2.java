package section15_OOP_Encapsulation_And_Abstraction;

class Rectangle
{
    // data-members
    int length;
    int breadth;

    // member function
    int area()
    {
        int a = length * breadth;
        return a;
    }


    int perimeter()
    {
        int p = 2 * ( length + breadth);
        return p;
    }
}


public class Example2
{
    public static void main(String[] args) {
        Rectangle r1 = null;
        r1 = new Rectangle();

        System.out.println(r1.length);
        System.out.println(r1.breadth);

        int a = r1.area();
        System.out.println("Area : " + a);

        int p = r1.perimeter();
        System.out.println("Perimeter : " + p);

        r1.length   = 10;
        r1.breadth  = 17;

        System.out.println(r1.length);
        System.out.println(r1.breadth);

        int a1 = r1.area();
        System.out.println("Area : " + a1);

        int p1 = r1.perimeter();
        System.out.println("Perimeter : " + p1);

    }
}
