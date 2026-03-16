package section29_Functional_Programming;

// 1. Introduction To Lambda Expressions
// Lambda Expressions Are Used For Defining Anonymous Functions Or Nameless Functions.
// Lambda Expressions Are Defined With The Help Of Interfaces.
// If A Interface Is Having Just A Single Abstract Method Then It Is Called As Functional Interface.
// Lambda Expressions Are Used To Easily Override The Functional Interfaces.

@FunctionalInterface
interface MyLambda1
{
    void display();
}

class MyLambdaImpl1 implements MyLambda1
{

    @Override
    public void display() {
        System.out.println("Hello World");
    }
}

public class Example1
{
    public static void main(String[] args) {

        // Child Can Hold The Object Of Child
        MyLambdaImpl1 instance1 = new MyLambdaImpl1();

        // Parent Can Hold The Object Of Child
        MyLambda1 instance2 = new MyLambdaImpl1();
        instance2.display();

        MyLambda1 instance3 = new MyLambda1()
        {
            @Override
            public void display()
            {
                System.out.println("Hello Indian Programmers");
            }
        };

        instance3.display();

        // Lambda Expressions
        MyLambda1 instance4 = () ->{
            System.out.println("Hello Lambda Programmers");
        };

        instance4.display();

    }
}
