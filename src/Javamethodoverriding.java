

class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override          //@Override is simply a notation to clarify that override is done.
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class Javamethodoverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}

/*
     Method Overriding in Java:

1.If the child class implements the same method present in the parent class again, it is know as method overriding.
2.Method overriding helps us to classify a behavior that is specific to the child class.
3.The subclass can override the method of the parent class only when the method is not declared as final.
4.Example :
5.In the below code, we've created two classes: class A & class B.
6.Class B is inheriting class A.
7.In the main() method, we've created one object for both classes. We're running the meth1() method on class A and B objects separately,
 but the output is the same because the meth1() is defined in the parent class, i.e., class A.

class A{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}

class B extends A{

}
public class CWH{
    public static void main(String[] args) {
        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();
    }
}

Output :
I am method 1 of class A
I am method 1 of class A

Now, let's see how we can override the meth1() for class B :

class A{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}

class B extends A{
    @Override
    public void meth1(){
        System.out.println("I am method 1 of class B");
    }


}
public class CWH{
    public static void main(String[] args) {
        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();
    }
}

Output :

I am method 1 of class A
I am method 1 of class B   */
