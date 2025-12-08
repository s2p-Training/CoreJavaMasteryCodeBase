package section10_Printing_And_String_Class;

public class Example0 {
    public static void main(String[] args) {
        System.out.println("Statement-1");
        System.out.println("Statement-2");

        long timeInMs = System.currentTimeMillis();
        System.out.println("Time In Ms " + timeInMs);

        long timeInNs = System.nanoTime();
        System.out.println("Time In Ns " + timeInNs);

        int[] src = {10,20,30,40,50};
        int[] dest = {0,0,0,0,0};

        System.arraycopy(src,0, dest,0,5);

        int[] A = {10,20,30,40,50,60,70};
        int[] B = {0,0,0,0,0};
        System.arraycopy(A,2,B,1,4);

        System.exit(0);
        System.out.println("Statement-3");
        System.out.println("Statement-4");
    }
}
