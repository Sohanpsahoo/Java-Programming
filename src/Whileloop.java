public class Whileloop {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        System.out.println("Using Loops:");
        int i = 100;
        while (i <= 200) {
            System.out.println(i);
            i++;
        }
        System.out.println("Finish Running While Loop!");
    }
}

//        while(true){
//            System.out.println("I am an infinite while loop!");
//        }

       /* While loops :
        1.The while loop in Java is used when we need to execute a block of code again and again based on a given boolean condition.
        2.Use a while loop if the exact number of iterations is not known.
        3.If the condition never becomes false, the while loop keeps getting executed. Such a loop is known as an infinite loop.


while (Boolean condition)

{

            // Statements    -> This keeps executing as long as the condition is true.

}        Example :

        int i=10;
        while(i>0){
            System.out.println(i);
            i--;
        }


    }

}

*/