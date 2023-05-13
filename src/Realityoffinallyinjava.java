   /*   Finally Block in Java & Why is it needed!
        Java finally block:

        1.Finally block contains the code which is always executed whether the exception is handled or not.

        2.It is used to exception is handled or not.

       3. It is used to execute code containing instructions to release the system resources, close a connection etc.  */

   package com.company;

   public class Realityoffinallyinjava {
       public static int greet(){
           try{
               int a = 50;
               int b = 10;
               int c = a/b;
               return c;
           }
           catch(Exception e){
               System.out.println(e);
           }
           finally {
               System.out.println("Cleaning up resources...This is the end of this function");
           }
           return -1;
       }

       public static void main(String[] args) {
           int k = greet();
           System.out.println(k);
           int a = 7;
           int b = 9;
           while(true){
               try{
                   System.out.println(a/b);
               }
               catch (Exception e){
                   System.out.println(e);
                   break;
               }
               finally{
                   System.out.println("I am finally for value of b = " + b);
               }
               b--;
           }

           try{
               System.out.println(50/3);
           }
           finally {
               System.out.println("Yes this is finally");
           }
       }
   }
