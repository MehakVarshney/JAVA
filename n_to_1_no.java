import java.util.Scanner;

public class n_to_1_no {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        while (i > n) {
            System.out.println(i);
            --i;
        }

    }

}
