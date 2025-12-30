package section19_OOP_Inner_Class;

class Outer5
{
    int x = 10;
    static int y = 12;

    static class Inner5
    {
        public void display()
        {
            System.out.println("Hello People");
        }
    }

}

public class Example5
{
    public static void main(String[] args)
    {
        Outer5.Inner5 inner5 = new Outer5.Inner5();
        inner5.display();
    }
}
