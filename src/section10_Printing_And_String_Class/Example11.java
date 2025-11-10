package section10_Printing_And_String_Class;

public class Example11
{
    public static void main(String[] args)
    {
        // Literal String
        String sData1 = "S2P";

        // Heap String
        String sData2 = new String("S2P");

        String sData3 = "S2P";

        boolean isSame;

        isSame = sData1 == sData2;
        System.out.println(isSame);

        isSame = sData1 == sData3;
        System.out.println(isSame);

        isSame = sData1.equals(sData2);
        System.out.println(isSame);

    }
}
