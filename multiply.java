import java.util.Scanner;

public class multiply {
    public static int multiply_no() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = a * b;
        System.out.println(multiply);
        return multiply;

    }

    public static void main(String[] args) {
        multiply_no();
    }
}
