package section37_java16_features.feature_record_classes.before_records;

import java.util.Objects;

/*
    While this accomplishes our goal, there are two problems with it:
    There’s a lot of boilerplate code
    We obscure the purpose of our class: to represent a person with a name and address
 */
class Person {

    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Person)) {
            return false;
        } else {
            Person other = (Person) obj;
            return Objects.equals(name, other.name)
                    && Objects.equals(address, other.address);
        }
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }

    // standard getters
}

public class Example1
{
    public static void main(String[] args) {

    }
}
