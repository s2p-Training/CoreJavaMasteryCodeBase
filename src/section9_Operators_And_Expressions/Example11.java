package section9_Operators_And_Expressions;

public class Example11
{
    // Calculating The Root Of Quadratic Equations
    public static void main(String[] args) {

        int a = 1;
        int b = 6;
        int c = 9;

        double delta = Math.pow(b,2) - (4 * a * c);
        double root1 = (-b + Math.sqrt(delta)) / (2*a);
        double root2 = (-b - Math.sqrt(delta)) / (2*a);

        System.out.println("Root1 : " + root1);
        System.out.println("Root2 : " + root2);
    }
}
