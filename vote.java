import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = a.nextInt();
        if (age > 18) {
            System.out.println("YOU CAN VOTE");
        } else if (age == 18) {
            System.out.println("age is 18");
        } else {
            System.out.println("YOU CANNOT VOTE");
        }

    }

}
