package section13_Introduction_To_Arrays;

public class Example7
{
    public static void main(String[] args) {
        // Changing The Size Of An Array InDirectly
        int[] A = new int[6];

        A[0] = 10;
        A[1] = 12;
        A[2] = 13;
        A[3] = 14;
        A[4] = 15;
        A[5] = 16;

        System.out.println(A.length);

        // Array A[] Is Completely Filled Now
        int[] B = new int[2 * A.length];

        // Copying The Elements From Source Array To Destination Array
        for(int i=0; i < A.length; i++)
        {
            B[i] = A[i];
        }

        // Changing The Links
        A = B;

        System.out.println(A.length);

        System.out.println("Printing Array Elements : ");
        // Printing Array Elements
        for(int i=0; i < A.length; i++)
        {
            System.out.println(A[i]);
        }

    }
}
