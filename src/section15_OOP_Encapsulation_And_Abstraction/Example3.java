package section15_OOP_Encapsulation_And_Abstraction;

class Circle
{
    // Properties
    float radius;

    // Behavior
    float perimeter()
    {
        float p = (float) (2 *  Math.PI * radius);
        return p;
    }

    float area()
    {
        float a = (float) (Math.PI * Math.pow(radius,2));
        return a;
    }
}


public class Example3
{
    public static void main(String[] args) {

        Circle c1 = null;

        c1 = new Circle(); // Default Constructor

        System.out.println("Radius : " + c1.radius);

        float a = c1.area();
        System.out.println("Area : " + a);

        float p = c1.perimeter();
        System.out.println("Perimeter : " + p);

        c1.radius = 100;
        System.out.println("Radius : " + c1.radius);

        a = c1.area();
        System.out.println("Area : " + a);

        p = c1.perimeter();
        System.out.println("Perimeter : " + p);

    }
}
