import javax.print.Doc;
class EkClass{
    int a;
    public int getA() {
        return a;
    }
    EkClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);    //It is used to call a constructor from the parent class which takes 1 argument i.e., c.
    System.out.println("I am a constructor"); }
}
public class Thisandsuperkeyword {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(e.getA()); } }

/*
        this and super keyword in Java:
this keyword in Java :

1.this is a way for us to reference an object of the class which is being created/referenced.
2.It is used to call the default constructor of the same class.
3.this keyword eliminates the confusion between the parameters and the class attributes with the same name.
 Take a look at the example given below :

class cwh{
    int x;

//    getter of x
    public  int getX(){
        return  x;
    }

    // Constructor with a parameter
    cwh(int x) {
        x = x;
    }

    // Call the constructor
    public static void main(String[] args) {
        cwh obj1 = new cwh(65);
        System.out.println(obj1.getX());

    }
}
Output :
0


    1.In the above example, the expected output is 65 because we have passed x=65 to the constructor of the cwh class.
     But the compiler fails to differentiate between the parameter 'x' & class attribute 'x.' Therefore, it returns 0.
     2,Now, let's see how we can handle this situation with the help of this keyword. Take a look at the below code :

class cwh{
    int x;

//    getter of x
    public  int getX(){
        return  x;
    }

    // Constructor with a parameter
    cwh(int x) {
        this.x = x;
    }

    // Call the constructor
    public static void main(String[] args) {
        cwh obj1 = new cwh(65);
        System.out.println(obj1.getX());

    }
}
Output :
65
Now, you can see that we've got the desired output

Super keyword
1.A reference variable used to refer immediate parent class object.
2.It can be used to refer immediate parent class instance variable.
3.It can be used to invoke the parent class method.         */