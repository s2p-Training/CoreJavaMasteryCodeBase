package section10_Printing_And_String_Class;

public class Example1
{
    // Introduction To Printing In Java
    // Understanding The Print( ) Method In Java
    public static void main(String[] args)
    {
        // Print Method : Prints the data in current line and does not move
        // the cursor to next line
        int x = 12;
        int y = 13;

        System.out.print(x);
        System.out.print(y);

        float f1 = 12.12f;
        float f2 = 13.13f;

        System.out.print(f1);
        System.out.print(f2);

        char c1 = 'A';
        char c2 = 'a';

        System.out.print(c1);
        System.out.print(c2);

        String sData1 = "S2P";
        String sData2 = "Java";

        System.out.print(sData1);
        System.out.print(sData2);

        System.out.print("Data Structures");
        System.out.println("And Algorithm");

    }
}
