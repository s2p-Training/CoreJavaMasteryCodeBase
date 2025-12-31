package section10_Printing_And_String_Class;

public class Example16
{
    public static void main(String[] args) {

        String s = "1";
        boolean res = s.matches("\\d");
        System.out.println(res);

        s = "7";
        res = s.matches("\\D");
        System.out.println(res);

        s = " ";
        res = s.matches("\\s");
        System.out.println(res);

        res = s.matches("\\S");
        System.out.println(res);

        s = "h";
        res = s.matches("\\w");
        System.out.println(res);

        s = "9";
        res = s.matches("\\w");
        System.out.println(res);

        s = "A";
        res = s.matches("\\W");
        System.out.println(res);

        s = "8";
        res = s.matches("\\W");
        System.out.println(res);

        s = ".";
        res = s.matches("\\.");
        System.out.println(res);
    }
}
