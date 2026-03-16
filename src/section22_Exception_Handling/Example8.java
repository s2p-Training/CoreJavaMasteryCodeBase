package section22_Exception_Handling;

import java.util.Scanner;

class UserInvalidDetailsException extends RuntimeException
{
    String errorType;
    String errorMessage;
    String methodName;

    public UserInvalidDetailsException(String errorType,String errorMessage,String methodName)
    {
        super(errorMessage);
        this.errorType = errorType;
        this.errorMessage = errorMessage;
        this.methodName = methodName;
    }

    public String getMessage()
    {
        return String.format("Error Type : %s, ErrorMessage: %s, MethodName : %s \n",errorType,errorMessage,methodName);
    }
}

class UserDetailsForm
{
    static Scanner Input = new Scanner(System.in);

    // Read Name From The User
    public static void getName()
    {
        System.out.println("Enter Your First Name : ");
        String firstName = Input.next();

        // Validation Code
        if(firstName.isEmpty())
        {
           throw new UserInvalidDetailsException("Field Error","First Can Not Be Empty","getName()");
        }

        if(firstName.matches("[a-zA-Z]+[0-9]+"))
        {
            throw new UserInvalidDetailsException("Field Error","First Name Can Not Contain Numbers","getName()");
        }

        if(firstName.matches("[a-zA-Z]+[@!#$%^&*()]+[0-9]+"))
        {
            throw new UserInvalidDetailsException("Field Error","First Name Can Not Contain Special Symbols","getName()");
        }
    }
}

public class Example8
{
    public static void main(String[] args) {
        UserDetailsForm.getName();
    }
}
