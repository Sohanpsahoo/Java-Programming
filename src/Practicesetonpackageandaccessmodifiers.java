    /*     Practice Set on Java Package & Access Modifiers:

        1.Create three classes calculator , Sc calculator and Hybridcalculator and group them into a package
        2.Use a build-in package in java to write a class which displays a message ( by using sout ) after taking input from the user
       3. Create a package in class with three package levels folder , folderL1 , folderL2
           folder1-----|
                       |
                       folderL1-----|
                                    |
                                    folderL2

        4.prove that you cannot access default property but can access protected properly from the subclass */

    class calculator{
        public void calculator(int a, int b){
            System.out.println("Your result is:"  +  a+b);
        }
    }
    class ScCalculator{
    public void calculator(int a, int b){
            System.out.println("Your result is:"  + Math.sin(a+b) );
            }}
    class Hybridcalculator{

        public void calculator(int  a, int b){
            System.out.println("Your result is:"  +  a+b);
            System.out.println("Your result is:"  + Math.sin(a+b));
        }
    }
    public class Practicesetonpackageandaccessmodifiers {
        public static void main(String[] args) {

            System.out.println("I am main method");
        }
    }