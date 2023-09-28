import java.util.Scanner;

public class count_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        String b[] = str.split(" ");
        System.out.println(b.length);

    }

}
