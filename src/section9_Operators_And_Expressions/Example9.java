package section9_Operators_And_Expressions;

public class Example9
{
    public static void main(String[] args)
    {
        // Herons Formula
        int a = 7;
        int b = 5;
        int c = 6;

        double s = (a+b+c)/2.0;

        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        System.out.println("Area Of Equilateral Triangle : " + area);
    }
}
