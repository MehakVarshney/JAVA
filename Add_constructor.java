import java.util.Scanner;

public class Add_constructor {
    int num1;
    int num2;
    int sum;

    Add_constructor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        sum = a + b;
    }

    void display() {
        System.out.println("The sum of given numbers are: " + sum);
    }

    public static void main(String[] args) {
        Add_constructor x = new Add_constructor();
        x.display();
    }
}
