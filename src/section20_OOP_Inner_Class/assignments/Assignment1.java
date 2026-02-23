package section20_OOP_Inner_Class.assignments;

// Can You Group These Classes Logically Using Inner Classes ?
class Vehicle
{
    private String brandName;
    VehicleService vehicleService;

    public void startJourney()
    {
        vehicleService.start();
    }
}

class VehicleService
{
   private Tyre tyre = new Tyre();
   private Speaker speaker = new Speaker();

   public void start()
   {
       System.out.println("Car Started...");
       tyre.rotate();
       speaker.playMusic();
   }
}

class Tyre
{
    public void rotate()
    {
        System.out.println("Rotate Tyres");
    }
}

class Speaker
{
    public void playMusic()
    {
        System.out.println("Play Music");
    }
}

public class Assignment1
{
    public static void main(String[] args)
    {

    }
}
