package section38_Java17_Features.feature_sealed_classes.after_sealed_classes;

sealed abstract class ZomatoVehicleServices permits Cycle,Moped, Bike
{
    abstract public void deliver();
}

final class Cycle extends ZomatoVehicleServices
{

    @Override
    public void deliver() {
        System.out.println("Food Delivery With Cycle");
    }
}

non-sealed class Moped extends ZomatoVehicleServices
{
    @Override
    public void deliver() {
        System.out.println("Food Delivery With Moped");
    }
}

sealed class Bike extends ZomatoVehicleServices permits ElectricBike
{
    @Override
    public void deliver() {
        System.out.println("Food Delivery With Bike");
    }
}

final class ElectricBike extends Bike
{
    @Override
    public void deliver() {
        System.out.println("Starting Electric Bike");
        super.deliver();
    }
}

/*
    A sealed class imposes three important constraints on its permitted subclasses:
        1. All permitted subclasses must belong to the same module as the sealed class.
        2. Every permitted subclass must explicitly extend the sealed class.
        3. Every permitted subclass must define a modifier: final, sealed, or non-sealed.
 */
class Example1
{
    public static void main(String[] args) {

        // Zomato Delivery With Cycle
        ZomatoVehicleServices zomato = new Cycle();
        zomato.deliver();

        // Zomato Delivery With Moped
        zomato = new Bike();
        zomato.deliver();

        // Zomato Delivery With Electric Bike
        zomato = new ElectricBike();
        zomato.deliver();

        // When sealing a class, we enable the client code to reason clearly
        // about all permitted subclasses with the help of pattern matching
        if(zomato instanceof Cycle cycle)
        {
            cycle.deliver();
        }
        else if(zomato instanceof ElectricBike electricBike)
        {
            electricBike.deliver();
        }
        else if(zomato instanceof Bike bike)
        {
            bike.deliver();
        }

    }
}
