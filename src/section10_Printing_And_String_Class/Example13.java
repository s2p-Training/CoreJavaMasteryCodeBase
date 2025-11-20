package section10_Printing_And_String_Class;

public class Example13
{
    public static void main(String[] args) {

        String skillSet = "Java C++ Python Js";
        String[] skills =  skillSet.split(" ");
        System.out.println(skills);

        System.out.println(skills[0]);
        System.out.println(skills[1]);
        System.out.println(skills[2]);

        String sData = "Java#Means#S2P";
        String[] data =  sData.split("#");
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[3]);

        String email = "thisispranayramteke@gmail.com";
        data = email.split("@");
        System.out.println(data[0]);
        System.out.println(data[1]);
    }
}
