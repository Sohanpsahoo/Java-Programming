class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {             //BUT BASE CLASS CANNOT ACCESS Y.
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        //WE CAN CALL METHODS FROM EITHER BASE CLASS OR DERIVED CLASS , WE WILL GET THE RESULTS SAME.
        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
    }
}

/*
         Inheritance in Java:
1.You might have heard people saying your nose is similar to your father or mother. Or, more formally,
 we can say that you've inherited the genes from your parents due to which you look similar to them.
2.The same phenomenon of inheritance is also valid in programming.
3.In Java, one class can easily inherit the attributes and methods from some other class.
This mechanism of acquiring objects and properties from some other class is known as inheritance in Java.
4.Inheritance is used to borrow properties & methods from an existing class.
5.Inheritance helps us create classes based on existing classes, which increases the code's reusability.

Important terminologies used in Inheritance :
1.Parent class/superclass: The class from which a class inherits methods and attributes is known as parent class.
2.Child class/sub-class: The class that inherits some other class's methods and attributes is known as child class.


Extends keyword in inheritance :
T1.he extends keyword is used to inherit a subclass from a superclass.
Syntax :
class Subclass-name extends Superclass-name
{
   //methods and fields
}
Example :
public class dog extends Animal {
              // code
                 }

Note: Java doesn't support multiple inheritances, i.e., two classes cannot be the superclass for a subclass.  */
