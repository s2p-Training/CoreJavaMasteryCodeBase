package section20_OOP_Inner_Class.assignments;

class UserAccount {

    private String username;
    private String password;
    private int loginAttempts = 0;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // ❌ Bad design: exposing password
    public String getPassword() {
        return password;
    }

    public void incrementAttempts() {
        loginAttempts++;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public String getUsername() {
        return username;
    }
}

class Authenticator {

    public boolean verify(UserAccount user, String enteredPassword) {

        return user.getPassword().equals(enteredPassword);
    }
}

public class Assignment3
{
    public static void main(String[] args) {

        UserAccount account = new UserAccount("thisispranayramteke","imdogbackwards");
        Authenticator authenticate = new Authenticator();
        boolean isAuthenticated =  authenticate.verify(account, "imdogbackwards");

        if(isAuthenticated)
        {
            System.out.println("Welcome User");
        }
        else
        {
            System.out.println("Wrong Username Or Password");
        }
    }
}