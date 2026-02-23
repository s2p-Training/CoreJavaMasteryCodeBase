package section15_OOP_Encapsulation_And_Abstraction;

// Student Challenge
class MyCircle
{
    // Properties
    private float radius;

    // Getters And Setter
    public float getRadius()
    {
        return radius;
    }

    public void setRadius(float rad)
    {
        radius = rad;
    }

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

public class Example7
{
    public static void main(String[] args) {

    }
}
