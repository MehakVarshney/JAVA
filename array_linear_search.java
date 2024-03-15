import java.util.Scanner;

public class array_linear_search {
    public static int linearsearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the key");
        int key = sc.nextInt();
        int index = linearsearch(number, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("the key is at index " + index);
        }
    }
}
