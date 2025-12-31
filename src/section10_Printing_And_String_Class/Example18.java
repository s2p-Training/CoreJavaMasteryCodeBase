package section10_Printing_And_String_Class;

public class Example18
{
    public static void main(String[] args)
    {
        String s = "aaabbbcaaabca";
        boolean res = s.matches("[abc]*");
        System.out.println(res);

        s = "abxyz";
        res = s.matches("[a-z]{5}");
        System.out.println(res);

        s = "abABazXZ";
        res = s.matches("[a-zA-Z]{6,12}");
        System.out.println(res);

        s = "sachinnandgirwar457@nvidia.dev.com";
        res = s.matches("\\w*@nvidia\\.dev\\.com");
        System.out.println(res);

        s = "sachinnandgirwar598@onmicrosoft.com";
        res = s.matches("\\w*@onmicrosoft\\.com");
        System.out.println(res);

        s = "sachinnandgirwar619@google.dev.com";
        res = s.matches("\\w*@google\\.dev\\.com");
        System.out.println(res);

        s = "+91 7378736863";
        res = s.matches("\\+91\\s?\\d{10}");
        System.out.println(res);

    }
}
