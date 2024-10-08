public class forloop {
    public static void main(String[] args) {
//        for (int i=1; i<=10; i++){
//            System.out.println(i);
//        }
        // 2i = Even Numbers = 0, 2, 4, 6, 8
        // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
        //int n = 3;
        //for (int i =0; i<n; i++){
        //    System.out.println(2*i+1);
        //}

        for(int i=5; i!=0; i--){
            System.out.println(i);
        }
    }
}

/*
For loop:
1.For loop in java is used to iterate a block of code multiple times.
2.Use for loop only when the exact number of iterations needed is already known to you.

Syntax :
 for (initialize; check_bool_expression; update){

            //code;

}

        1.Initializer: Initializes the value of a variable. This part is executed only once.
        2.check_bool_expression: The code inside the for loop is executed only when this condition returns true.
        3.
        update: Updates the value of the initial variable.
        Example :
        for (i=7; i!=0; i--){

        System.out.println(i);

        }
        The above for loop initializes the value of i=7 and keeps printing as well as decrementing the value of i till i do not get equals to 0.
 */