   /* ArrayList in Java: Demo & Methods:

       1. The ArrayList class is the dynamic array found in the java.util package.
        2.The size of the normal array can not be changed, but ArrayList provides us the ability to increase or decrease the size.
        3,ArrayList is slower than the standard array, but it helps us to manipulate the data easily.

        How to declare an ArrayList :
        ArrayList<Integer> l1 = new ArrayList<>();    /*Creates an ArrayList object of integer type

        Performing various operations on ArrayList :


        ArrayList comes with a number of methods that can be used to manipulate the data of the ArrayList.
            Let’s take a look at some of the important methods of ArrayList :

            1.Adding an element :
            ==>add() method is used to insert an element in the ArrayList.
            ==>add(Object): Inserts an element at the end of the ArrayList.
            ==>add(Index,Object) : Inserts an element at the given index.

            Example :

            import java.util.*;
    public class CWH extends Thread{
        public static void main(String[] args) {

            ArrayList<Integer> l1 = new ArrayList<>();
            l1.add(1);
            l1.add(2);
            l1.add(3);
            l1.add(4);
            l1.add(6);
            l1.add(5,5);  // inserts 5 at the 5th index in l1

            System.out.println(l1);
        }
    }
        Output :
        [1, 2, 3, 4, 6, 5]

                2.Removing an Element :
                ==>remove() method is used to delete or remove an element at a given index from the ArrayList.

                Syntax :
                L1.remove(index number)

                Example :

    import java.util.*;
    public class CWH extends Thread{
        public static void main(String[] args) {

            ArrayList<Integer> l1 = new ArrayList<>();
            l1.add(1);
            l1.add(2);
            l1.add(3);
            l1.add(4);
            l1.add(6);
            l1.add(5,5);  // inserts 5 at the 5th index in l1

            System.out.println("Array list before : "+ l1);

            l1.remove(0);
            System.out.println("ArrayList after removing the value at index 0 :" + l1);

        }
    }
        Output :
        Array list before : [1, 2, 3, 4, 6, 5]
        ArrayList after removing the value at index 0 : [2, 3, 4, 6, 5]

       3. Checking if an ArrayList contains a specific value or not :

        ==>contains() method is used to check if an ArrayList contains a specified element or not. This method returns the boolean value.
        Example :
        import java.util.*;
    public class CWH extends Thread{
        public static void main(String[] args) {

            ArrayList<Integer> l1 = new ArrayList<>();
            l1.add(1);
            l1.add(2);
            l1.add(3);
            l1.add(4);
            l1.add(5);
            l1.add(6);

            System.out.println("Array list : "+ l1);
            System.out.println("L1 list contains 7 : " + l1.contains(7));
            System.out.println("L1 list contains 4 : " + l1.contains(4));


        }
    }
        Output :
        Array list before : [1, 2, 3, 4, 5, 6]
        L1 list contains 7 : false
        L1 list contains 4 : true

        4.Merging two ArrayLists :
        ==>The elements of an ArrayList can be merged into another Arraylist with the help of the addAll() method.

        Example :

        import java.util.*;
    public class CWH extends Thread{
        public static void main(String[] args) {

            ArrayList<Integer> l1 = new ArrayList<>();
            ArrayList<Integer> l2 = new ArrayList<>();

            l1.add(1);
            l1.add(2);
            l1.add(3);
            l1.add(4);
            l1.add(5);
            l1.add(6);

            l2.add(11);
            l2.add(12);
            l2.add(13);
            l2.add(14);

            System.out.println("L1 Array list : "+ l1);
            System.out.println("L2 Array list : " +l2);
            l1.addAll(l2);
            System.out.println("L1 Array list after merging: "+ l1);
            System.out.println("L2 Array list : " +l2);


        }
    }
Output :
        L1 Array list : [1, 2, 3, 4, 5, 6]
        L2 Array list : [11, 12, 13, 14]
        L1 Array list after merging: [1, 2, 3, 4, 5, 6, 11, 12, 13, 14]
        L2 Array list : [11, 12, 13, 14]

        You can add the elements of l2 at the starting of l1 by typing :
        L1.addAll(0,l2);

       5. Finding the first occurrence of a specified number in the ArrayList :
        ==>Indexof() method prints the index of the first occurrence of a particular number.
        Returns -1 if the element is not present in the ArrayList.

        Example :
        import java.util.*;
    public class CWH extends Thread{
        public static void main(String[] args) {

            ArrayList<Integer> l1 = new ArrayList<>();

            l1.add(1);
            l1.add(2);
            l1.add(3);
            l1.add(4);
            l1.add(5);
            l1.add(6);
            l1.add(3);

            System.out.println("L1 Array list : "+ l1);
            System.out.println("The first occurrence of 3 in l1 is at index : " + l1.indexOf(3));


        }
        Output :
        L1 Array list : [1, 2, 3, 4, 5, 6, 3]
        The first occurrence of 3 in l1 is at index : 2
        Similarly, you can also find the index of the last occurrence of an element with the help of the lastIndexOf() method.

        Example :
                import java.util.*;
        public class CWH extends Thread{
            public static void main(String[] args) {

                ArrayList<Integer> l1 = new ArrayList<>();

                l1.add(1);
                l1.add(2);
                l1.add(3);
                l1.add(4);
                l1.add(5);
                l1.add(3);
                l1.add(6);
                l1.add(3);

                System.out.println("L1 Array list : "+ l1);
                System.out.println("The last occurrence of 3 in l1 is at index : " + l1.lastIndexOf(3));


            }
        }
        Output :
        L1 Array list : [1, 2, 3, 4, 5, 3, 6, 3]
        The last occurrence of 3 in l1 is at index : 7                       */


   import java.util.*;

   public class Javaarraylistandmethods {
       public static void main(String[] args) {
           LinkedList<Integer> l1 = new LinkedList<>();
           LinkedList<Integer> l2 = new LinkedList<>();
           l2.add(15);
           l2.add(18);
           l2.add(19);

           l1.add(6);
           l1.add(7);
           l1.add(4);
           l1.add(6);
           l1.add(0, 5);
           l1.add(0, 1);
           l1.addAll(0, l2);
           l1.addLast(676);
           l1.addFirst(788);
           System.out.println(l1.contains(27));
           System.out.println(l1.indexOf(6));
           System.out.println(l1.lastIndexOf(6));
           //l1.clear();
           l1.set(1, 566);
           for(int i=0; i<l1.size(); i++){
               System.out.print(l1.get(i));
               System.out.print(", ");
           }
       }
   }



