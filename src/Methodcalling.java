public class Methodcalling {

    static int logic(int x, int y){     //If static is not there then every object created will have its own copy.
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;         //if here we assign the value of x as lets, say 10 0r anything other than the below,
        }                           // then, the value will not get changed as only a copy is sent to the calling method
        return z;                   // But in case of arrays , it will get changed as the reference/address is passed to the
    }                               // calling method.


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using Object creation:>>>
        // Methodcalling obj = new Methodcalling();     // If static keyword is not used , then we have to create an
        // c = obj.logic(a, b);                            object so that we can call the above function.
        c = logic(a, b);
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}



/*      Java Tutorial: Methods in Java
        1.Sometimes our program grows in size, and we want to separate the logic of the main method from the other methods.
        2.For instance, if we calculate the average of a number pair 5 times, we can use methods to avoid repeating the logic. [DRY – Don’t Repeat Yourself]

        Syntax of a Method:
        A method is a function written inside a class. Since Java is an object-oriented language, we need to write the method inside some class.

        Syntax of a method :
        returnType nameOfMethod() {   //inside the () , we need to write the parameters.
//Method body
        }
        The following method returns the sum of two numbers:

        int mySum(int a, int b) {
        int c = a+b;
        return c;	//Return value
        }

        1.In the above method, int is the return data type of the mySum function.
       2. mySum takes two parameters: int a and int b.
        3.The sum of two values integer values(a and b) is stored in another integer value named 'c'.
        4.mySum returns c.


        Calling a Method :
        A method can be called by creating an object of the class in which the method exists followed by the method call:

        Calc obj = new Calc(); //Object Creation
        obj.mySum(a , b); //Method call upon an object

        The values from the method call (a and b) are copied to the a and b of the function mySum.
         Thus, even if we modify the values a and b inside the method, the values in the main method will not change.

        Void return type :
        When we don’t want our method to return anything, we use void as the return type.

        Static keyword :
        1.The static keyword is used to associate a method of a given class with the class rather than the object.
        2.You can call a static method without creating an instance of the class.
        3.In Java, the main() method is static, so that JVM can call the main() method directly without allocating any extra memory for object creation.
        4.All the objects share the static method in a class.

        Process of method invocation in Java :

        Consider the method Sum of the calculate class as given in the below code :

class calculate{
    int sum(int a,int b){
        return a+b;
    }
    The method is called like this:

    class calculate{
        int sum(int a,int b){
            return a+b;
        }

        public static void main(String[] args) {

            calculate obj = new calculate();
            int c = obj.sum(5,4);
            System.out.println(c);
        }
    }
    Output :
            9

   1. Inside the main() method, we've created an object of the calculate class.
   2. obj is the name of the object in the calculate class.
   3. Then, we've invoked the sum method and passed 5 and 4 as arguments.

    Note: In the case of Arrays, the reference is passed. The same is the case for object passing to methods. */
