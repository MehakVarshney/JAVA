import java.util.Scanner;

public class sum_even {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        while (i <= n) {
            System.out.println(i);
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("the sum is:" + sum);

    }
}
