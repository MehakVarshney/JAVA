import java.util.Scanner;

public class divisiblitycheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("The given number is not divisible by both 3 and 5");

        }
    }

}
