abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class Abstractclassesandmethods {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error SINCE IT IS A ABSTRACT CLASS.
        Child2 c = new Child2();
        //Child3 c3 = new Child3(); -- error
    }
}

/*

 Java Tutorial: Abstract Class & Abstract Methods:
What does Abstract mean?
Abstract in English means existing in through or as an idea without concrete existence.
ABSTRACT CLASS IS A SUCH A CLASS BY THE HELP OF WHICH WE CAN CREATE OTHER CLASSES.
Abstract class :
1.An abstract class cannot be instantiated.
2.Java requires us to extend it if we want to access it.
3.It can include abstract and non-abstract methods.
4.If a class includes abstract methods, then the class itself must be declared abstract, as in:
public abstract class phone Model {
             abstract void switch off ();
              || more code
              }
5.Abstract class are used when we want to achieve security & abstraction(hide certain details & show only necessary details to the user)

Example :
abstract class Phone{
  abstract void on();
}
class SmartPhone extends Phone{
void run(){
System.out.println("Turning on...");
}
public static void main(String args[]){
 Phone obj = new SmartPhone();
 obj.on();
}
}

Output :
Turning on...

Abstract method :
1.A method that is declared without implementation is known as the abstract method.
2.An abstract method can only be used inside an abstract class.
3.The body of the abstract method is provided by the class that inherits the abstract class in which the abstract method is present.
4.In the above example, on() is the abstract method.      */

