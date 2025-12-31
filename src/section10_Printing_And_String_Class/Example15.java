package section10_Printing_And_String_Class;

public class Example15
{
    public static void main(String[] args)
    {
        String s = "x";
        boolean res = s.matches(".");
        System.out.println(res); //true

        s = "12";
        res = s.matches(".");
        System.out.println(res); //true

        s = "b";
        res = s.matches("[abc]");
        System.out.println(res); //true

        s = "az";
        res = s.matches("[abc][vz]");
        System.out.println(res); //true

        s = "x";
        res = s.matches("[^abc]");
        System.out.println(res); //true

        s = "3";
        res = s.matches("[a-z1-7]");
        System.out.println(res); //true

        s = "d";
        res  = s.matches("[a-z1-7]");
        System.out.println(res); //true

        s = "A";
        res = s.matches("[A|B]");
        System.out.println(res); //true

        s = "XY";
        res = s.matches("XY");
        System.out.println(res); //true


    }
}
