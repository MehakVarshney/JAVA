import java.util.*;

public class anagram_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char str1array[] = str1.toCharArray();
            char str2array[] = str2.toCharArray();

            Arrays.sort(str1array);
            Arrays.sort(str2array);

            boolean result = Arrays.equals(str1array, str2array);
            if (result) {
                System.out.println("Anagram");
            } else {
                System.out.println("not anagram");
            }

        } else {
            System.out.println("length are not equal");
        }
    }
}
