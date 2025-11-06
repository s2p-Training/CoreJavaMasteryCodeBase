package section9_Operators_And_Expressions;

public class Example4
{
    // Student Should Debug This :)
    public static void main(String[] args)
    {
        // Calculation In Java Happens In Higher Data Type
        // byte + byte = int
        byte lbNum1 = 12;
        byte lbNum2 = 19;

        int  r1 = lbNum1 + lbNum2;

        // short + short = int
        short lsNum1 = 130;
        short lsNum2 = 200;

        int r2   = lsNum1 + lsNum2;

        // int + int = int
        int lnNum1 = 1200;
        int lnNum2 = 1230;

        int r3 = lnNum1 + lnNum2;

        // float + int => float
        int   lnNum3 = 1300;
        float lfNum  = 1400;

        float r4     = lnNum3 + lfNum;

        System.out.println(r4);

        // double + float => double
        double ldNum1 = 12.122222;
        float  lfNum1 = 1.234f;

        double r5 = ldNum1 + lfNum1;

        // String + Anything = String [Golden Rule]
        String sData = "S2P";

        String res   = sData + 12;

        res  = sData + 12 + 13;

        res  = sData + (12 + 13);

    }
}
