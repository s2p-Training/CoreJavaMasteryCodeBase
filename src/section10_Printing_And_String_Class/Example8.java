package section10_Printing_And_String_Class;

public class Example8
{
    // Understanding width with String Object
    public static void main(String[] args) {

        String sData = "Java Jr.";
        System.out.printf("%20s\n",sData);
        System.out.printf("%-20s\n",sData);

//        System.out.format("FORMAT_STRING","PARAMS");
//        is similar to to printf() method.
    }
}
