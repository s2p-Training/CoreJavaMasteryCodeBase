package section10_Printing_And_String_Class;

public class Example2
{
    // Understanding Escape Sequence Characters
    // A character with a backslash (\) just before it is an escape sequence or escape character.
    public static void main(String[] args)
    {
        int x = 12;
        int y = 13;

        System.out.print(x + "\t");
        System.out.print(y + "\t");

        float f1 = 12.12f;
        float f2 = 13.13f;

        System.out.print("\n" + f1 + "\n");
        System.out.print(f2 + "\n");

        char c1 = 'A';
        char c2 = 'a';

        System.out.print(c1 + "\n");
        System.out.print(c2 + "\n");

        String sData1 = "S2P";
        String sData2 = "Java";

        System.out.print(sData1 + " ");
        System.out.print(sData2 + "\n");

        System.out.print("Data Structures" + "\n");
        System.out.print("And Algorithm");
    }
}
