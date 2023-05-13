class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);  //To call the constructor with parameters from the parent class.
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends  Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}
public class Constructorsininheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();     //HERE AFTER BOTH BASED AND DERIVED CLASS WILL RUN 1ST BASE THEN DERIVED WHEN WE CALL THE DERIVED CLASS.
        // Derived1 d = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}

/*
        Constructors in Inheritance in Java:

Constructors in Inheritance:
When a derived class is extended from the base class, the constructor of the base class is executed first followed
by the constructor of the derived class. For the following Inheritance hierarchy , the constructors are executed in the order:

1.C1- Parent
2.C2 - Child
3.C3 - Grandchild

Constructors during constructor overloading :

1.When there are multiple constructors in the parent class, the constructor without any parameters is called from the child class.
2.If we want to call the constructor with parameters from the parent class, we can use the super keyword in the derived class.
3.super(a, b) calls the constructor from the parent class which takes 2 variables   */