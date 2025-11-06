package section9_Operators_And_Expressions;

public class Example3
{
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        System.out.println(a/b); // This Line Gives Arithmetic Exception Division By Zero

        float a1 = 10;
        float a2 = 0;
        System.out.println(a1/a2); // Division By Zero For Float Gives Infinity as Answer

    }
}
