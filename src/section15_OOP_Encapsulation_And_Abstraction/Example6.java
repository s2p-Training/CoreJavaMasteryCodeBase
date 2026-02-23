package section15_OOP_Encapsulation_And_Abstraction;

// Student Challenge
class MyTelevision
{
    private String brandName;
    private int channelNumber;
    private  int volume;
    private boolean isOn;

    public void turnOnOff()
    {
        isOn = !isOn;
    }

    public String getBrandName()
    {
        return brandName;
    }

    public void setBrandName(String brand)
    {
        brandName = brand;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}

public class Example6
{
    public static void main(String[] args)
    {
        MyTelevision television = new MyTelevision();
        television.setBrandName("Samsung");
        television.setOn(true);
        television.setVolume(10);
        television.setChannelNumber(3);

        System.out.println(television.isOn());
        System.out.println(television.getBrandName());
        System.out.println(television.getChannelNumber());
        System.out.println(television.getVolume());
    }
}
