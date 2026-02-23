package section15_OOP_Encapsulation_And_Abstraction;

class MyRectangle
{
    private int length;
    private int breadth;

    // Getters And Setters
    public void setLength(int len)
    {
        if(len > 0)
        {
            length = len;
        }
    }

    public int getLength()
    {
        return length;
    }

    public void setBreadth(int bre)
    {
        if(bre > 0)
        {
            breadth = bre;
        }
    }

    public int getBreadth() {
        return breadth;
    }

    public int area()
    {
        int a = length * breadth;
        return a;
    }

    public int perimeter()
    {
        int p = 2 * (length + breadth);
        return p;
    }

}

public class Example5
{
    public static void main(String[] args)
    {
        MyRectangle r1 = new MyRectangle();
        r1.setLength(10);
        r1.setBreadth(5);

        int len = r1.getLength();
        System.out.println("Length " + len);

        int bre = r1.getBreadth();
        System.out.println("Breadth : " + bre);

        int a = r1.area();

        System.out.println("Area : " + a);
        System.out.println("Perimeter : " + r1.perimeter());

    }
}
