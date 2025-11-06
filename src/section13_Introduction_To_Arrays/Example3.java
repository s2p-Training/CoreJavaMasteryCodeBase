package section13_Introduction_To_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Example3
{
    public static void main(String[] args) {
        // Examples Of Array For Different Data Type
        byte[] bNums    = {-128,0,1,2,3,127};
        System.out.println(bNums);
        System.out.println(Arrays.toString(bNums));

        short[] sNums   = {-32000, -21000, 0, 2100, 32000};
        System.out.println(sNums);
        System.out.println(Arrays.toString(sNums));

        int[] nNums = {Integer.MIN_VALUE, -32000, 10 , 20,Integer.MAX_VALUE};
        System.out.println(nNums);
        System.out.println(Arrays.toString(nNums));

        boolean[] bools = new boolean[5];
        System.out.println(bools);
        System.out.println(Arrays.toString(bools));

        String[] names = new String[5];
        names[1] = "Pranay";
        names[3] = "Diya";

        Integer[] numbers = new Integer[10];
        System.out.println(Arrays.deepToString(numbers));

        Scanner[] scanners = new Scanner[5];
        System.out.println(Arrays.deepToString(scanners));

    }
}
