import java.util.Scanner;

public class factorial_function {
    public static int factorial() {
        int i = 1;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
        return fact;
    }

    public static void main(String[] args) {
        factorial();
    }
}
