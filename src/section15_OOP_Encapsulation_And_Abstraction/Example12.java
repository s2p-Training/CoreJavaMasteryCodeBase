package section15_OOP_Encapsulation_And_Abstraction;

// Student Challenge
class Customer
{
    private int customerId;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;

    public Customer(int customerId, String name)
    {
        this.customerId = customerId;
        this.name = name;
    }

    public Customer(int customerId, String name, String email)
    {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public Customer(int customerId, String name, String phoneNumber, String email, String address) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
}

public class Example12
{
    public static void main(String[] args) {

    }
}
