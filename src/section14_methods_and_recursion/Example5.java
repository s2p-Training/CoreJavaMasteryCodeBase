package section14_methods_and_recursion;

public class Example5
{
    static String getWebsiteName(String websiteUrl)
    {
        // Starting point + 1 to get index of first word of a website
        int startPoint = websiteUrl.indexOf('.') + 1;

        // Ending point to get last index of '.' keyword, to get the last character of website name
        int endPoint   = websiteUrl.lastIndexOf('.');

        String websiteName = websiteUrl.substring(startPoint, endPoint);

        return  websiteName;
    }

    public static void main(String[] args)
    {
        String ans = getWebsiteName("www.s2pedutech.com");
        System.out.println(ans);

        ans = getWebsiteName("www.youtube.com");
        System.out.println(ans);

        String website1 = "www.lenskart.com";
        ans = getWebsiteName(website1);
        System.out.println(ans);
    }
}
