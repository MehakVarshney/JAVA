import java.util.*;

public class array_largest_number {
    public static int getlargest(int numbers[]) {
        int largest_num = Integer.MIN_VALUE;
        int smallest_num = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest_num) {
                largest_num = numbers[i];
            }
            if (numbers[i] < smallest_num) {
                smallest_num = numbers[i];
            }
        }
        System.out.print(smallest_num);
        System.out.println();
        return largest_num;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 5, 4, 3, 9, 6 };
        int largest_number = getlargest(numbers);
        System.out.println(largest_number);
    }

}
