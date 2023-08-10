// MEHAK VARSHNEY 37(2215001072)
import java.util.Scanner;

public class gratestnumber {
    public static void main(String[] args) {
        System.out.println("HERE WE ARE GOING TO FIND THE MAXIMUM NUMBER:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number (a)");
        int a = sc.nextInt();
        System.out.println("Enter the second number (b):");
        int b = sc.nextInt();
        System.out.println("Enter the second number (c):");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("A is greater");
        } else if (b > a && b > c) {
            System.out.println("B is greater");
        } else {
            System.out.println("C is greater");
        }
    }

}
