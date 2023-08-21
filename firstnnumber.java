// MEHAK VARSHNEY(37) 2215001072
import java.util.Scanner;

public class firstnnumber {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        do {
            System.out.println(i);
            i++;
        } while (i <= a);
    }

}
