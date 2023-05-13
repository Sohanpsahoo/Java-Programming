public class breakcontinue {
    public static void main(String[] args) {
        // Break and continue using loops!
//        for (int i=0;i<50;i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        int i=0;
//        do{
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }while(i<5);
//        System.out.println("Loop ends here");


//            for(int i=0;i<50;i++){
//            if(i==2){
//                System.out.println("Ending the loop");
//                continue;                                //It will skip 2 , will not go down and iteration goes to 3.
//            }
//                System.out.println(i);
//                System.out.println("Java is great");
//        }
        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<5);
        System.out.println("Loop ends here");
    }
}

/*

Break statement :
1.The break statement is used to exit the loop irrespective of whether the condition is true or false.
2.Whenever a ‘break’ is encountered inside the loop, the control is sent outside the loop.

Syntax :

break;
Example to demonstrate the use of break inside a for loop :
public class CWH_break {
public static void main(String[] args) {
    //using for loop
    for(int i=10;i>0;i--){
        if(i==7){
            break;   //break the loop
        }
        System.out.println(i);
    }
}

Output :
10
9
8

Continue statement :
1.The continue statement is used to immediately move to the next iteration of the loop.
2.The control is taken to the next iteration thus skipping everything below ‘continue’ inside the loop for that iteration.

Syntax :

continue;

==> Example to demonstrate the use of continue statement inside a for loop :

public class CWH_continue {
public static void main(String[] args) {

    for(int i=7;i>0;i--){
        if(i==3){
            continue;//continue skips the rest statement
        }
        System.out.println(i);
    }
}

Output :
7
6
5
4
2

In a Nut Shell
break statement completely exits the loop
continue statement skips the particular iteration of the loop.
 */
