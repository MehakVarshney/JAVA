import java.util.Scanner;

public class sum_naturalno {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        while (i <= n) {

            sum = sum + i;
            i++;
        }
        System.out.println("The sum is:" + sum);
    }
}
