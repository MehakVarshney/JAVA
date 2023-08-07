import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        int age;
        System.out.println("ENTER YOUR AGE:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("YOU ARE GOING TO BECOME ADULT");
                break;
            case 26:
                System.out.println("YOU ARE  READY FOR A JOB");
                break;
            case 60:
                System.out.println("YU ARE GOING TO GET RETIRED");
                break;
            default:
                System.out.println("ENJOY YOUR LIFE");

        }

    }

}
