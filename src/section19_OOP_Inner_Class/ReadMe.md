# Inner Class

# Topics To Be Covered
1. Nested Inner Class
2. Local Inner Class
3. Anonymous Inner Class
4. Static Inner Class

If you have a class and it is becoming very complex and you want to make it little simple and anything is repeating in that one, then you can write it in the form of class itself.
To reduce the complexity of bigger class you define a class inside it.
Likewise you can also define the interface inside the class.

Types of Inner Class
1. Nested Inner Class
2. Local Inner Class
3. Anonymous Inner Class
4. Static Inner Class

## 1.Inner Class:
Inner Class Can Access The Members Of Outer Class Directly.
Outer Class Can Not Access The Members Of Inner Class Directly Unless It Has Created The Object Of Inner Class. So It can create an object and use the members of outer class.
For creating the object of inner class out of the inner class, first we need to create the object of outer class and then with the help of outer class object we can the object of inner class.
The right way is outer class should use the object of inner class internally. Rather than creating the object of inner class out of outter class.
Inner class should be used indirectly via outer class. This is more realistic approach.

## 2. 