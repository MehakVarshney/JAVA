import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n = n / 10;
        }
        System.out.println("The reverse of the given number is " + rev);
    }

}
