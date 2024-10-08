/*
Java Tutorial: Practice Questions on Arrays in Java
        1.Create an array of 5 floats and calculate their sum.
        2.Write a program to find out whether a given integer is present in an array or not.
        3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
        4. Create a Java program to add two matrices of size 2x3.
        5.Write a Java program to reverse an array.
        6.Write a Java program to find the maximum element in an array.
        7.Write a Java program to find the maximum element in a Java array.
        8.Write a Java program to find whether an array is sorted or not.    */

//Soln:

public class Practice6arrays {
    public static void main(String[] args) {
        // Practice Problem 1
        /* float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);


        // Practice Problem 2
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.57f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }


        // Practice Problem 3

        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum/marks.length);


        // Practice Problem 4
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }

        // Practice Problem 5
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);  //to divide and give the greatest integer value.
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

        // Practice Problem 6 (For printing Max element)
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = 0; //we can also take int max = Integer.MAX_VALUE so that it can work for negative integers
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        // Integer.MAX_VALUE WILL GIVE THE MAX VALUE IN INTEGER

     */
        // Practice Problem 7
        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){   /* i<arr.length-1 ---> so that after last two elements are compared,
        then , there is no further element to be compared with last one so length-1 */

            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }


    }
}

