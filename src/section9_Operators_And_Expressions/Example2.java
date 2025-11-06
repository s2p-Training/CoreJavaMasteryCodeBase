package section9_Operators_And_Expressions;

public class Example2
{
    public static void main(String[] args) {
        // More Information About Modulus Operator


        // When You Take Modulus Of Any Number With 10 It Returns
        // The Value Of Unit Place Digit
        // Ex.
        // 12345 % 10 ---> 5 (Unit Place Digit)
        int x = 12345;
        int unitPlaceDigit = x % 10;
        System.out.println("The Value Of X : " + x);
        System.out.println("Unit Place Digit : " + unitPlaceDigit);

        // Modulus Operator Is A Circular Operator Which Is Used To Trim The Large
        // Number Into Specified Length
        int trimmedNumber = 1234567890 % 100;
        System.out.println("Trimmed Number : " + trimmedNumber);
    }
}
