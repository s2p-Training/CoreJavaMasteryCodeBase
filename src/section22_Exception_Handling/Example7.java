package section22_Exception_Handling;

import java.time.LocalDate;
import java.time.LocalDateTime;

// Check Exception : Which Forces To Write The Try And Catch Or Modify The Method Signature.
class UserNotFoundException extends Exception
{
    LocalDateTime time;

    public UserNotFoundException(String message)
    {
        super(message);
        time = LocalDateTime.now();
    }

    public String getMessage()
    {
        return super.getMessage() + " at : " + time.toString() + "\n";
    }

}

class User
{
    String username;
    String password;

    User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
}

public class Example7
{

    public static boolean findUsersFromUsername(String username,String password) throws UserNotFoundException
    {
        User[] users = new User[5];

        users[0] = new User("Rohan","rohan@123");
        users[1] = new User("Rajesh","raj@lotus75");
        users[2] = new User("Kumar","kumar@456");
        users[3] = new User("Priyanka","disneyland@61");
        users[4] = new User("Divya","kosla@46");

        // Finding The Users From The Populated Array By Name

        boolean isFound = false;

        for(User target : users)
        {
            if(target.username.equals(username) && target.password.equals(password))
            {
                isFound = true;
                break;
            }
        }

        if(!isFound)
        {
            throw new UserNotFoundException("User not found for username: " + username + " or Invalid Password : " + password);
        }

        return isFound;

    }

    public static void main(String[] args)
    {
        try
        {
            boolean result = findUsersFromUsername("Priyanka","disneyland@61");
            System.out.println("Result : " + result);
        }
        catch (UserNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
