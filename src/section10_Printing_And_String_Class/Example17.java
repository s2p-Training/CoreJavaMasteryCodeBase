package section10_Printing_And_String_Class;

public class Example17
{
    public static void main(String[] args)
    {
        String s = "";
        boolean res = s.matches(".*");

        s = "s2pEduTech";
        res = s.matches(".*");

        s = "sachin@s2p.com";
        res = s.matches(".*");

        s = "7378736964";
        res = s.matches(".*");

        s = "";
        res = s.matches(".+");

        s = "s2pEduTech";
        res = s.matches(".+");

        s = "sachin@s2p.com";
        res = s.matches(".+");

        s = "7378736964";
        res = s.matches(".+");

        s = "";
        res = s.matches(".?");

        s = "s";
        res = s.matches(".?");

        s = "s2pedutech";
        res = s.matches(".?");

        s = "javas2p";
        res = s.matches(".{7}");

        s = "Java Means S2P";
        res = s.matches(".{10,20}");

        s = "Regular Expressions";
        res = s.matches("[a-zA-Z\\s]{10,25}");

        s = "s2pedutech@gmail.com";
        res = s.matches("[a-z0-9\\S]{5,25}@gmail\\.com");

    }
}
