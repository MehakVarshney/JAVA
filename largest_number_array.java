import java.util.Scanner;

public class largest_number_array {
    public static int largnum(int marks[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (largest < marks[i]) {
                largest = marks[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        int marks[] = new int[size];
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("The largest number is:" + largnum(marks));
    }

}
