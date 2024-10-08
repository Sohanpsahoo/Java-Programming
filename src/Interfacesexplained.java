interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    //public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }       //In the case of interface we have to do public.
    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po po");
    }
}
public class Interfacesexplained {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454; //cannot be done.
        //System.out.println(cycleHarry.a);

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
    }
}

/*

Java Tutorial: Introduction to Interfaces:

Interfaces in Java :

1.Just like a class in java is a collection of the related methods, an interface in java is a collection of abstract methods.
2.The interface is one more way to achieve abstraction in Java.
3.An interface may also contain constants, default methods, and static methods.
4.All the methods inside an interface must have empty bodies except default methods and static methods.
5.We use the interface keyword to declare an interface.
6.There is no need to write abstract keyword before declaring methods in an interface because an interface is implicitly abstract.
7.An interface cannot contain a constructor (as it cannot be used to create objects)
8.In order to implement an interface, java requires a class to use the implement keyword.

Example to demonstrate Interface in Java :

interface Bicycle {
            void apply brake ( int decrement );
            void  speed up ( int increment );
            }

class Avon cycle implements Bicycle {
            int speed = 7 ;
             void apply brake ( int decrement ) {
                     speed = speed - decrement ;
                         }
        void speedup ( int increment ){
                 speed = speed + increment ;
                    }                                   */

