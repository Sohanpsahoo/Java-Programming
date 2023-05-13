public class Dowhileloop {
    public static void main(String[] args) {
//        int a = 0;
//        while(a<5){
//            System.out.println(a);
//            a++;
//        }
        int b = 10;
        do {
            System.out.println(b);
            b++;
        }while(b<5);

        int c = 1;
        do{
            System.out.println(c);
            c++;
        }while(c<=45);

    }
}


/* Do-while loop:
1.Do- while loop is similar to a while loop except for the fact that it is guaranteed to execute at least once.
2.Use a do-while loop when the exact number of iterations is unknown, but you need to execute a code block at least once.
3.After executing a part of a program for once, the rest of the code gets executed on the basis of a given boolean condition.

Syntax :
 do {


            //code

} while (condition);            //Note this semicolon

Example :
        int i=1;
        do{
        System.out.println(i);
        i++;
        }while(i<=10);


        Difference Between while loop and do-while loop :


        1.while – checks the condition & executes the code.
        2.do-while – executes the code at least once and then checks the condition. Because of this reason,
        the code in the do-while loop executes at least once, even if the condition fails.
*/