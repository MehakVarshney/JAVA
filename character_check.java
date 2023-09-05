import java.util.Scanner;

public class character_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anything: ");
        char a = sc.next().charAt(0);
        if (a >= 'a' && a <= 'z') {
            System.out.println("Alphabet");
        } else if (a >= '0' && a <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }

    }
}
