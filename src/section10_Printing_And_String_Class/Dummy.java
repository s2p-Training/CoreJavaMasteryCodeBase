package section10_Printing_And_String_Class;

public class Dummy
{
    public static void main(String[] args)
    {
        String sData1 = "S2PEduTech";
        int length    = sData1.length();
        System.out.println("Length Of String : " + length);

        String sData2 = "";
        length = sData2.length();
        System.out.println("Length Of Empty String : " + length);

        int first = 0;
        System.out.println(sData1.charAt(first));

        int mid = (sData1.length()-1)/2;
        System.out.println(sData1.charAt(mid));

        int last = sData1.length()-1;
        System.out.println(sData1.charAt(last));


        sData2 = "CORE JAVA MASTERY";
        String lowerCaseSData2 = sData2.toLowerCase();

        System.out.println("Original String : " + sData2);
        System.out.println("LowerCase : " + lowerCaseSData2);

        String sData3 = "java means s2p";
        String upperCaseSData3 = sData3.toUpperCase();

        System.out.println("Original String : " + sData3);
        System.out.println("UpperCase : " + upperCaseSData3);

        String sData4 = "    s2p  ";
        String trimmedSData4 = sData4.trim();

        System.out.println("Original String : " + sData4);
        System.out.println("Trimmed String  : " + trimmedSData4);

        String sData5 = "Java means S2P";
        String replacedSData5 = sData5.replace('a','A');

        System.out.println("Original String : " + sData5);
        System.out.println("Replaced String : " + replacedSData5);

        String sData6 = "www.s2pedutech.com";
        boolean isWebsite = sData6.startsWith("www.");

        System.out.println("Original String : " + sData6);
        System.out.println("Is a website    : " + isWebsite);

        String sData8 = "www.youtube.com";
        boolean isCommercialWebsite = sData8.endsWith(".com");

        System.out.println("Original String              : " + sData8);
        System.out.println("Is a commercial website      : " + isCommercialWebsite);

        String sData9 = "core java mastery";
        boolean isPresent = sData9.contains("java");

        System.out.println("Original String : " + sData9);
        System.out.println("Is Java Present : " + isPresent);

        String sData10 = "";
        boolean isEmpty = sData10.isEmpty();
        System.out.println("Is Empty : " + isEmpty);
        System.out.println("Length   : " + sData10.length());

        isEmpty = "S2P Edutech".isEmpty();
        System.out.println("Is Empty : "+ isEmpty);

        String sData11 = "      ";
        boolean isBlank = sData11.isBlank();
        System.out.println("Is Blank : " + isBlank);

        isBlank = "".isBlank();
        System.out.println("Is Blank : " + isBlank);

        isBlank = "\n\n\n".isBlank();
        System.out.println("Is Blank : " + isBlank);

        isBlank = "\t\t\t".isBlank();
        System.out.println("Is Blank : " + isBlank);

        String sData12 = "JavaS2P";
        int foundIndex = sData12.indexOf('a');
        System.out.println("Found At : " + foundIndex);

        foundIndex     = sData12.indexOf(97);
        System.out.println("Found At : " + foundIndex);

        foundIndex     = sData12.indexOf('q');
        System.out.println("Found At : " + foundIndex);

        String sData13 = "LearningIsFun";

        foundIndex = sData13.indexOf('n',4);
        System.out.println("n Found At : " + foundIndex);

        foundIndex = sData13.indexOf('n',7);
        System.out.println("n Found At : " + foundIndex);

        String sData14 = "LearningAngular";
        foundIndex = sData14.lastIndexOf('a');
        System.out.println("a Found At : " + foundIndex);

        foundIndex = sData14.lastIndexOf('a',12);
        System.out.println("a Found At : " + foundIndex);

        String sData15 = "S2PJava";
        String sub1 = sData15.substring(0);
        System.out.println("substring-1 : " + sub1);

        String sub2 = sData15.substring(1);
        System.out.println("substring-2 : " + sub2);

        String sub3 = sData15.substring(2);
        System.out.println("substring-3 : " + sub3);

        String sub4 = sData15.substring(3);
        System.out.println("substring-4 : " + sub4);

        String sub5 = sData15.substring(4);
        System.out.println("substring-5 : " + sub5);

        String sub6 = sData15.substring(5);
        System.out.println("substring-6 : " + sub6);


        String sData16 = "CocaCola";
        String sub7 = sData16.substring(0,1);
        System.out.println("substring from 0 to 1 : " + sub7);

        String sub8 = sData16.substring(0,5);
        System.out.println("substring from 0 to 5 : " + sub8);

        String sub9 = sData16.substring(2,6);
        System.out.println("substring from 2 to 6 : " + sub9);

        String sData17 = "C++ Java Python";
        String[] skills1 = sData17.split(" ");
        System.out.println(skills1[1]);

        String sData18 = "C++#Java#Python";
        String[] skills2 = sData17.split("#");
        System.out.println(skills2[0]);

        String[] words = {"Java", "Means", "S2P"};
        String sData19 = String.join("#",words);
        System.out.println(sData19);

        String sData20 = String.join(" ",words);
        System.out.println(sData20);

        String sData21 = String.join("@",words);
        System.out.println(sData21);

    }
}
