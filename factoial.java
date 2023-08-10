// MEHAK VARSHNEY 37(2215001072)
import java.util.Scanner;

public class factoial {
    public static void main(String[] args) {
        int i = 1;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("The factorial is: " + fact);
    }
}
