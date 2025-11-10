package section14_methods_and_recursion;

public class Example4
{
    static void changePrimitive(int x)
    {
        System.out.println("Function Start");
        System.out.println(x);
        x++;
        System.out.println(x);
        System.out.println("Function End");
    }

    static void changeArray(int[] nums)
    {
        nums[0] = -99;
    }

    public static void main(String[] args)
    {
        int a = 10;
        changePrimitive(a);
        System.out.println(a);

        int[] A = {1,2,3,4,5};
        System.out.println(A[0]);
        changeArray(A);
    }
}
