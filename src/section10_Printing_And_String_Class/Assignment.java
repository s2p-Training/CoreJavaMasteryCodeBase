package section10_Printing_And_String_Class;

class Assignment4
{
    public static void main(String[] args)
    {

        String path = "C:/Users/Pranay/Documents/Projects/Java";

        // Split using forward slash separator
        String[] folders = path.split("/");

        System.out.println("Folder : " + folders[0]);
        System.out.println("Folder : " + folders[1]);
        System.out.println("Folder : " + folders[2]);
        System.out.println("Folder : " + folders[3]);
        System.out.println("Folder : " + folders[4]);
        System.out.println("Folder : " + folders[5]);
        float f = 123.4567f;
        System.out.printf("%10.3f\n", f);
        System.out.printf("%(012.2f", -12.3456);
        int x = -12;
        System.out.printf("\n%+06d \n",172);



        String sData1 = "Javaop";
        String sData2 = "aop";

        System.out.println(sData1.indexOf(sData2,1));


    }
}

