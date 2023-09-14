import java.util.Scanner;

public class alphabet_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Alphabet: ");
        char c = sc.next().charAt(0);
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println("The entered thing is alphabet");
        } else {
            System.out.println("The entered thing is not alphabet");
        }

    }
}
