import java.util.Scanner;
//import java.util.*;
public class Javapackages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as " + a);
    }
}

/*
        Java Tutorial: Creating Packages in Java:

How to create a package in Java :
javac -d Harry java

The above code creates a packages folder.
java Harry java
The above code creates Harry class.

1.We can also create inner packages by adding packages inner as the package name.
2.These packages once created can be used by other classes.        */