import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String s = sc.next();
        s = s.toLowerCase();
        int[] b = new int[26];
        for (int i = 0; i < s.length(); i++) {
            b[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] > 0) {
                System.out.printf("%c=%d", i + 97, b[i]);
            }
        }
    }
}
