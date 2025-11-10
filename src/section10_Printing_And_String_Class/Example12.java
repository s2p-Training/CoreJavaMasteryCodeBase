package section10_Printing_And_String_Class;

import java.util.Locale;

public class Example12
{
    public static void main(String[] args) {
        // Understanding String Methods
        String sData1 = "S2PEduTech";

        /*
            length() returns the length of the string i.e. number of characters in a string
         */
        int length    = sData1.length();
        System.out.println("Length Of String : " + length);

        /*
            charAt() method takes integer argument and returns the character present at given
            index in string
         */
        int first = 0;
        System.out.println(sData1.charAt(first));

        int mid = (sData1.length()-1)/2;
        System.out.println(sData1.charAt(mid));

        int last = sData1.length()-1;
        System.out.println(sData1.charAt(last));

        /*
            LowerCase() will change the string to lower case and returns the lower
            case string.
         */
        String sData2 = "CORE JAVA MASTERY";
        String lowerCaseSData2 = sData2.toLowerCase();

        System.out.println("Original String : " + sData2);
        System.out.println("LowerCase : " + lowerCaseSData2);

        /*
            UpperCase() will change the string to upper case and return the new string
         */
        String sData3 = "java means s2p";
        String upperCaseSData3 = sData3.toUpperCase();

        System.out.println("Original String : " + sData3);
        System.out.println("LowerCase : " + upperCaseSData3);

         /*
            Trim() will remove the leading and trailing blank spaces.It is useful when you are
            taking string as an input from user
         */
        String sData4 = "    s2p  ";
        String trimmedSData4 = sData4.trim();

        System.out.println("Original String : " + sData4);
        System.out.println("Trimmed String  : " + trimmedSData4);

        /*
            Replace() method takes two arguments: old character and new character.It will replace
            every old character in string with new character and a new string is returned
         */
        String sData5 = "Java means S2P";
        String replacedSData5 = sData5.replace('a','A');

        System.out.println("Original String : " + sData5);
        System.out.println("Replaced String : " + replacedSData5);

        /*
           StartsWith() returns the boolean value based on the argument passed to it.
           It checks if the string is beginning with passed string then returns true
           otherwise false.
         */
        String sData6 = "www.s2pedutech.com";
        boolean isWebsite = sData6.startsWith("www.");

        System.out.println("Original String : " + sData6);
        System.out.println("Is a website    : " + isWebsite);

        /*
           EndsWith() method is used to check whether string is ending with particular word
           or not.This method returns boolean value.
         */
        String sData7 = "www.wikipedia.org";
        boolean isOrganizationWebsite = sData7.endsWith(".org");

        System.out.println("Original String              : " + sData7);
        System.out.println("Is a organization website    : " + isOrganizationWebsite);

    }
}
