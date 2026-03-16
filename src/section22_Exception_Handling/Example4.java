package section22_Exception_Handling;

public class Example4
{
    // Example Of Nested Try-Catch Blocks
    public static void main(String[] args)
    {

        try {
            int A[] = {10, 0, 8, 3, 5};

            try {
                int r = A[0] / A[1];
                System.out.println(r);
            } catch (ArithmeticException exception) {
                System.out.println(exception.getMessage());
            }

        }catch (ArithmeticException exception)
        {
            System.out.println();
        }

    }
}
