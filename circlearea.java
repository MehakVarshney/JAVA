import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {
        System.out.println("HERE WE ARE GOING TO CALCULATE THE AREA OF A CIRCLE");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        float r = sc.nextFloat();
        float area = (3.14f) * r * r;
        System.out.println("The area of a circle is:");
        System.out.println(area);
    }

}
