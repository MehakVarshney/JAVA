import java.util.Scanner;

public class no_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("THE NUMBER IS POSITIVE");
        } else if (a < 0) {
            System.out.println("THE NUMBER IS NEGATIVE");
        } else {
            System.out.println("THE NUMBER IS ZERO");
        }
    }

}
