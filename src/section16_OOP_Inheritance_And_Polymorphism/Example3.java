package section16_OOP_Inheritance_And_Polymorphism;

class Rectangle
{
    int length;
    int breadth;

    public int area()
    {
        return (length * breadth);
    }

    public int perimeter()
    {
        return 2 * (length + breadth);
    }
}


class Cuboid extends Rectangle
{
    int height;

    public int volume()
    {
        int v = length * breadth * height;
        return v;
    }
}

public class Example3
{
    public static void main(String[] args)
    {
        Cuboid c1 = new Cuboid();

        c1.length   = 10;
        c1.breadth  = 18;
        c1.height   =  24;

        int vol = c1.volume();
        int area = c1.area();
        int perimeter = c1.perimeter();

        System.out.println("Volume      : " + vol);
        System.out.println("Area        : " + area);
        System.out.println("Perimeter   : " + perimeter);
    }
}
