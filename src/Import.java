
import java.util.Scanner;

public class Import {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int a = sc.nextInt();
        // float a = sc.nextFloat();
        System.out.println("Enter the second one");
        int b = sc.nextInt();
        // float b = sc.nextFloat();
        int sum = a+b;
        // float sum = a+b;
        System.out.println("The sum is" );
        System.out.println(sum);
    }
}
