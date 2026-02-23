# Static And Final Keyword In Java


# static keyword Can Be USed With 
1. static variables
2. static methods
4. static nested classes
5. static blocks

Static keyword is used for representing meta-data. Data about data.
They are useful for representing the information of a class. Though all the objects can 
share that information.

Static members are useful for representing data related to the class.
If you have data related to the class then you can use the static variables.
If that static data needs some processing then you can use the static methods.
If you have a lot of static data or static methods, that can be grouped together and made as a nested class.

### Static Variables 
Static data members belongs to the same class and are shared by all the objects of a class
Static members can be accessed with the help of class name.
There will be only one copy or one instance of a static variable, common for all objects.
Static members ( static variables or static method ) of a class are created inside the method-area.
Static members are available once the class is loaded.
If your program is using the class which is having static variable then these members will be available when the
class is loaded. So these members will be created inside the method area independent of the objects. That's why wihtout creating the object
we can access the static members by using the class name.


### Static Methods
If that static data needs some processing then you can use the static methods.
Static methods can be accessed from object as well as class name.
Static Methods belongs to a class. They are common for all the objects.
Static methods can access only static members or other static methods of a class.
Static context can access static context only. It can not access non-static context.
Collection of static methods put together to form static nested class.
You can not use super or this keyword in static context.

### Static Blocks
We can write down set of statement as a block. And declare it as static and those of set of blocks will be executed before the
creation of any object of that class.
The order of execution of static block execution depends on the order they appear.
Static blocks are used for initializing the static variables and executing static methods.
Inside static block we can access only static members and methods of a class.
Static block is executed during the loading time of a class. Class Loader is responsible for loading the class.
There can be more than one static blocks in a class. They will be executed in the order in which you've defined them.
The use of static block is when you have to initialize something or setup something that if everythign is static only.
This feature is introduced in java version 1.7 version.

## Final Keyword
1. final variable
2. final method
3. final class

### final variables
Final is just like a constant But It can be used in various ways.
It can be used to create the final variables, final methods and final classes.
Final variables are those variables whose value can not changed once the value is attached or initialized.
Final variables can not be modified.

### Final method
final keyword used with method adds the restriction to method overriding.
final keyword is used to create immutable methods.
A method whose behavior can not change inside the child class, such methods are known as Immutable methods.
final method is used to stop polymorphism.
It is used to freeze the method.

## Final Class
final keyword used with class, makes the class immutable. It is used to stop inheritance.
final class can not be extended via child class.
final keyword used with class it used to stop inheritance.
it is used to freeze the class.
