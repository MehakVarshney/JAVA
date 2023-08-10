// MEHAK VARSHNEY 37(2215001072)
import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal(P)");
        float P = sc.nextFloat();
        System.out.println("Enter the rate(R)");
        float R = sc.nextFloat();
        System.out.println("Enter the time(T)");
        float T = sc.nextFloat();
        float SI = (P * R * T) / 100;
        System.out.println("THE SIMPLE INTEREST IS:");
        System.out.println(SI);

    }

}
