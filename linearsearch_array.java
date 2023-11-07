
/*public class linearsearch_array {
    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}*/
import java.util.Scanner;

public class linearsearch_array {
    public static int linearsearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        int index = linearsearch(number, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key is at index:" + index);
        }

    }
}
