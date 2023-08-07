import java.util.Scanner;

public class calculatepersentage {
    public static void main(String[] args) {
        System.out.println("HERE WE ARE GOING TO CALCULATE THE PERCENTAGE");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ENGLISH MARKS:");
        int a = sc.nextInt();
        System.out.println("ENTER THE MATHS MARKS:");
        int b = sc.nextInt();
        System.out.println("ENTER THE PHYSICS MARKS:");
        int c = sc.nextInt();
        System.out.println("ENTER THE CHEMISTRY MARKS:");
        int d = sc.nextInt();
        System.out.println("ENTER THE HINDI MARKS:");
        int e = sc.nextInt();

        float percentage = ((a + b + c + d + e) / 500.0f) * 100;
        System.out.println("percentage:");
        System.out.println(percentage);

    }

}
