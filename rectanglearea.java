// MEHAK VARSHNEY 37 (2215001072)
import java.util.Scanner;

public class rectanglearea {
    public static void main(String[] args) {
        System.out.println("HERE WE ARE GOING TO CALCULATE THE AREA OF RECTANGLE");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int l = sc.nextInt();
        System.out.println("Enter the breath of the rectangle:");
        int b = sc.nextInt();
        int area = l * b;
        System.out.println("THE AREA OF THE GIVEN CIRCLE IS :");
        System.out.println(area);
    }

}
