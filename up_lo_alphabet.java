import java.util.Scanner;

public class up_lo_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char a = sc.next().charAt(0);
        if (a >= 'a' && a <= 'z') {
            System.out.println("Lowercase");
        } else if (a >= 'A' && a <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Other thing");
        }
    }

}
