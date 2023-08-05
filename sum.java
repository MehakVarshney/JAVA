import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("Here we are going to calculate the sum of two number:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int a = sc.nextInt();
        System.out.println("Enter your second number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of a and b is:");
        System.out.println(sum);
    }

}
