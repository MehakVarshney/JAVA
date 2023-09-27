public class swap {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        swap(a, b);

    }

}
