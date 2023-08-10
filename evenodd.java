// MEHAK VARSHNEY 37 (2215001072)
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("HERE WE ARE GOING TO CHECK WHEATHER THE NUMBER IS EVEN OR ODD");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("THE GIVEN NO IS EVEN");
        } else {
            System.out.println("THE GIVEN NUMBER IS ODD");
        }
    }

}
