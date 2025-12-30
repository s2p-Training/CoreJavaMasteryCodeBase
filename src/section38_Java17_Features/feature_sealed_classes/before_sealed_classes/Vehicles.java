package section38_Java17_Features.feature_sealed_classes.before_sealed_classes;

/*
    purpose of a class hierarchy can be to model various possibilities
    that exist in a domain.

    As an example, imagine a business domain that only works with cars and trucks, not motorcycles.
    When creating the Vehicle abstract class in Java, we should be able to allow only Car and Truck classes
    to extend it. As such, we want to ensure that there will be no misuse of the Vehicle abstract class
    within our domain.

    Before version 15 (in which sealed classes were introduced as a preview), Java assumed that code reuse
    is always the goal. Every class was extendable by any number of subclasses.

    In earlier versions, Java provided limited options in the area of inheritance control.

    A final class can have no subclasses. A package-private class can only have subclasses in the same package.

    Using the package-private approach:
    users can’t access the abstract class without also allowing them to extend it:

    Key-Points:
    1. Superclass Accessible, Not Extensible
    2. A superclass that’s developed with a set of its subclasses should be able to document
       its intended usage, not constrain its subclasses. Also, having restricted subclasses
       shouldn’t limit the accessibility of its superclass
 */
public class Vehicles
{
    abstract static class Vehicle
    {
        private final String registrationNumber;

        public Vehicle(String registrationNumber)
        {
            this.registrationNumber = registrationNumber;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }
    }

    public static final class Car extends Vehicle
    {
        private final int numberOfSeats;

        public Car(int numberOfSeats, String registrationNumber) {
            super(registrationNumber);
            this.numberOfSeats = numberOfSeats;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }
    }

    public static final class Truck extends Vehicle {

        private final int loadCapacity;

        public Truck(int loadCapacity, String registrationNumber) {
            super(registrationNumber);
            this.loadCapacity = loadCapacity;
        }

        public int getLoadCapacity() {
            return loadCapacity;
        }

    }
}
