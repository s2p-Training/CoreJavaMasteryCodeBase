package section15_OOP_Encapsulation_And_Abstraction;


class Television
{
    // data
    int channelNumber;
    int volume;

    // behaviour
    void changeChannel(int ch)
    {
        channelNumber = ch;
    }

    void changeVolume(int vol)
    {
        volume = vol;
    }
}

public class Example1
{
    public static void main(String[] args)
    {
         Television t1 = null;
         t1 = new Television();

        System.out.println(t1.volume);
        System.out.println(t1.channelNumber);

        t1.volume = 10;
        t1.channelNumber = 34;

        System.out.println(t1.volume);
        System.out.println(t1.channelNumber);

        t1.changeChannel(110);
        t1.changeVolume(50);

        System.out.println(t1.channelNumber);
        System.out.println(t1.volume);

    }
}
