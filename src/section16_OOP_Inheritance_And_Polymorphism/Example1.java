package section16_OOP_Inheritance_And_Polymorphism;

class Circle
{
    private float radius;

    public Circle()
    {
        radius = 100;
    }

    public float area()
    {
        return (float)(Math.PI * Math.pow(radius,2));
    }

    public float perimeter()
    {
        return (float) (2 * Math.PI * radius);
    }

    public float getRadius()
    {
        return radius;
    }

    public void setRadius(float r)
    {
        radius = r;
    }

}

class Cylinder extends Circle
{
    private float height;

    public Cylinder()
    {
        height = 120;
    }

    public float volume()
    {
        return  area() * height;
    }

    public float getHeight()
    {
        return height;
    }

    public void setHeight(float h)
    {
        height = h;
    }
}

public class Example1
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        float rad =  c1.getRadius();
        System.out.println(rad);

        Cylinder c2 = new Cylinder();
        rad = c2.getRadius();
        float h = c2.getHeight();

    }
}
