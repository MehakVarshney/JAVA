import java.util.Scanner;

public class smallest_num_array {
    public static int small_num(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("The smallest number in the array is:" + small_num(num));
    }

}
