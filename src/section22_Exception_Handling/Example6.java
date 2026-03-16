package section22_Exception_Handling;

/**
 *
 * Learning About Builtin Classes In Java
 *
 *                  Object
 *                   |
 *                Throwable
 *                 /     \
 *          Exception    Error
 *              /          \
 *
 */

class InvalidAgeException extends RuntimeException
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
}

public class Example6 {
    
    public static void main(String[] args)
    {

    }
}