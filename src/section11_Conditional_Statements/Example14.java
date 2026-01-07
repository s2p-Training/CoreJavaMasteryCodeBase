package section11_Conditional_Statements;

import java.util.Scanner;

public class Example14
{
    public static void main(String[] args) {
        // http://www.wikipedia.org
        // http://www.sourceforge.net
        // http://www.simple.biz/
        // http://www.usa.gov/
        // https, ftp are some protocols

        System.out.println("Start Of Program");

        Scanner Input = new Scanner(System.in);
        String url;

        System.out.println("Enter the website url : ");
        url = Input.nextLine();

        String protocol = url.substring(0,url.indexOf(':'));

        if(protocol.equals("http"))
        {
            System.out.println("Hyper Text Transfer Protocol");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }

        String extension = url.substring(url.lastIndexOf(".") + 1);

        if(extension.equals("com"))
        {
            System.out.println("Commercial website");
        }
        else if(extension.equals("org"))
        {
            System.out.println("Organization website");
        }
        else if(extension.equals("net"))
        {
            System.out.println("Network website");
        }

        // Also Fetch Website Name
        int firstIndex = url.indexOf('.') + 1;
        int lastIndex  = url.lastIndexOf('.');
        String website = url.substring(firstIndex, lastIndex);

        System.out.println("Website Name " + website);

        Input.close();

        System.out.println("End Of Program");

    }
}
