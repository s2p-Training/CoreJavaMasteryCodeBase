package section18_OOP_Interfaces;

interface IMember
{
    void callback();
}

class Store
{
    int count = 0;
    IMember[] members = new Customer[10];

    public void register(IMember member)
    {
        members[count] = member;
        count++;
    }

    public void notifyPremiumCustomers()
    {
        for (int i=0; i < count; i++)
        {
            members[i].callback();
        }
    }

}

class Customer implements IMember
{
    String name;
    String email;
    String phoneNumber;

    public void callback()
    {
        System.out.println("Okay!, I Will Visit Store, " + name);
    }
}

public class Example4
{
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.name = "Pranay";

        Customer customer2 = new Customer();
        customer2.name = "Rajesh";

        Customer customer3 = new Customer();
        customer3.name = "Rohan";

        Customer customer4 = new Customer();
        customer4.name = "Sachin";

        Store store = new Store();

        store.register(customer1);
        store.register(customer2);
        store.register(customer4);

        store.notifyPremiumCustomers();

    }
}
