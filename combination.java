import java.util.Scanner;

public class combination {
    public static int factorial(int a) {
        int i = 1;
        int fact = 1;
        while (i <= a) {
            fact = fact * i;
            i++;
        }
        return fact;
    }

    public static int combii(int a, int b) {
        int a_fact = factorial(a);
        int b_fact = factorial(b);
        int amb_fact = factorial(a - b);
        int combination = a_fact / (b_fact * amb_fact);
        return combination;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();
        System.out.println(combii(n, r));

    }

}
