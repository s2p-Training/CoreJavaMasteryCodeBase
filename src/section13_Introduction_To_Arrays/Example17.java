package section13_Introduction_To_Arrays;

public class Example17
{
    public static void main(String[] args) {
        int[][] A = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] B = {
                {1,0,1},
                {2,1,0},
                {0,0,1}
        };

        int row = 3;
        int col = 3;

        // Adding Two Matrices
        int[][] C = new int[3][3];

        for(int i=0; i < row; i++)
        {
            for(int j=0; j < col; j++)
            {
               C[i][j] = A[i][j] + B[i][j];
            }
        }

        for(int i=0; i < row; i++)
        {
            for(int j=0; j < col; j++)
            {
                System.out.print(C[i][j] + " ");
            }
            System.out.print("\n");
        }


    }
}
