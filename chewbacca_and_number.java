import java.util.*;

public class chewbacca_and_number {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        char[] digits = s.toCharArray();

        if (digits[0] - '0' > 9 - (digits[0] - '0')) {
            digits[0] = (char) ('9' - digits[0]);
        }

        for (int i = 1; i < digits.length; i++) {
            int digit = digits[i] - '0';
            if (digit > 9 - digit) {
                digits[i] = (char) ('9' - digit + '0');
            }
        }
        String resultStr = new String(digits);
        int result = Integer.parseInt(resultStr);
        System.out.println(result);
    }
}