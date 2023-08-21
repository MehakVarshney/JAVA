import java.util.Scanner;

public class method {
    /*
     * void area_of_circle(int r) {
     * System.out.println(3.14 * r * r + "is the area of circle ");
     * }
     * 
     * void area_of_rectangle(int a, int b) {
     * System.out.println(a * b + "is the area of rectangle ");
     * }
     * 
     * public static void main(String[] args) {
     * method t = new method();
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter the radius of the circle:");
     * int x = sc.nextInt();
     * System.out.println("Enter the length of the rectangle:");
     * int y = sc.nextInt();
     * System.out.println("Enter the breath of the rectangle:");
     * int z = sc.nextInt();
     * t.area_of_circle(x);
     * t.area_of_rectangle(y, z);
     * }
     */
      static void area_of_circle(float r) {
      System.out.println(3.14f * r * r + "is the area of circle");
      }
      
      static void area_of_rectangle(int a, int b) {
      System.out.println(a * b + "is the area of rectangle");
     }
      
     public static void main(String[] args) {
     method t = new method();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the radius of the circle:");
     int x = sc.nextInt();
     System.out.println("Enter the length of the rectangle:");
     int y = sc.nextInt();
     System.out.println("Enter the breath of the rectangle:");
     int z = sc.nextInt();
     area_of_circle(x);
     area_of_rectangle(y, z);
      }
}
