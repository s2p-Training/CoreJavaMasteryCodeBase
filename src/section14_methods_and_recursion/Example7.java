package section14_methods_and_recursion;

public class Example7
{
    void printNames(String...name)
    {
        for(String t :name)
        {
            System.out.println(t);
        }
    }

    public static void main(String...args)
    {
           Example7 instance = new Example7();

           instance.printNames();
           instance.printNames("Pranay");
           instance.printNames("Pranay", "Diya","Vedant");
    }
}
