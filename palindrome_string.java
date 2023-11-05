import java.util.*;

public class palindrome_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        A = sc.nextLine();
        int i, j, pldm;
        i = 0;
        j = A.length() - 1;
        pldm = 0;
        while (i < j && pldm == 0) {
            if (A.charAt(i) != A.charAt(j)) {
                i = i + 1;
                j = j - 1;
            }
        }
        if (pldm == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
