// MEHAK VARSHNEY 37 (2215001072)
import java.util.Scanner;

public class naturalno_dowhile {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number:");
        int n = sc.nextInt();
        do {
            System.out.println(n);
            --n;

        } while (n >= i);
    }

}
