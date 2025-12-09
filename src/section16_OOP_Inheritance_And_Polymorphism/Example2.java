package section16_OOP_Inheritance_And_Polymorphism;

class Cellphone
{
    private String IMEINumber;
    private String phoneNumber;

    public void saveContact()
    {
        System.out.println("Saving Contact With Cellphone");
    }

    public void sendSMS()
    {
        System.out.println("Sending SMS With Cellphone");
    }

    public void makeCall()
    {
        System.out.println("Making Call With Cellphone");
    }

    public void deleteContact()
    {
        System.out.println("Deleting Contact With Cellphone");
    }

}


class SmartPhone extends Cellphone
{
    private String MACAddress;
    private String IPAddress;

    public void makeVideoCall()
    {
        System.out.println("Making Video Call With SmartPhone");
    }

    public void playMusic()
    {
        System.out.println("Playing Music With SmartPhone");
    }

    public void browseInternet()
    {
        System.out.println("Browsing Internet With SmartPhone");
    }
}



public class Example2
{
    public static void main(String[] args)
    {
        Cellphone cellphone = new Cellphone();

        SmartPhone smartPhone = new SmartPhone();

        // exclusive features of smartphone
        smartPhone.browseInternet();
        smartPhone.makeVideoCall();
        smartPhone.playMusic();

        // Inherited Features From CellPhone
        smartPhone.saveContact();
        smartPhone.sendSMS();
        smartPhone.makeCall();
        smartPhone.deleteContact();
    }
}
