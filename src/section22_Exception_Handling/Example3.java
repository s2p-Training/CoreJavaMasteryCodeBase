package section22_Exception_Handling;

public class Example3
{
    public static void main(String[] args) {

        int A[] = {10,0,8,3,5};
        int r;

        try {
            r = A[2] / A[3];
            System.out.println(r);
            System.out.println(A[10]);
        }
        catch(ArithmeticException exception)
        {
            System.out.println(exception.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println(exception.getMessage());
        }

        // Note:
        // While writing multiple catch blocks the Exception Classes References Should Be
        // Written From Sub-Class To Super Class order if there is hierarchy in between classes.
        // If not written correctly, then super class reference will overshadow all error objects of
        // subclass.

    }
}
