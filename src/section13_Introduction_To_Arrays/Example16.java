package section13_Introduction_To_Arrays;

import java.util.Arrays;

public class Example16
{
    public static void main(String[] args) {
        // Understanding Matrix Data Structure
        int[][] matrix = new int[3][];

        matrix[0] = new int[3];
        matrix[1] = new int[3];
        matrix[2] = new int[3];

        // Setting Matrix Elements
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 1;

        matrix[1][0] = 1;
        matrix[1][1] = 1;
        matrix[1][2] = 1;

        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][2] = 1;

        for(int i=0; i < matrix.length; i++)
        {
            for(int j=0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
