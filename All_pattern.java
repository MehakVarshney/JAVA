public class All_pattern {
    public static void stair_star(int n) {
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void stair_star_opp(int n) {
        for (int line = n; line > 0; line--) {
            for (int star = 0; star < line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void stair_star_opp2(int n) {
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void num_stairs(int n) {
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static void num_strair_opp(int n) {
        for (int i = n; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void num_stairs2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }

    public static int alphabet_pattern(int n) {
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        return 0;
    }

    public static void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void holorect(int totrow, int totcol) {
        for (int i = 1; i <= totrow; i++) {
            for (int j = 1; j <= totcol; j++) {
                if (i == 1 || i == totrow || j == 1 || j == totcol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void hrh(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                if ((i == 1) || (i == n) || (j == 1) || (j == n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void hlfpyr(int row, int col) {
        for (int i = 1; i <= row; i++) {
            // spaces
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void f_tri(int n, int counter) {
        for (int i = 1; i <= n; i++) { // ye bala loop ye btata h ki kitni line print hogi
            for (int j = 1; j <= i; j++) { // ye bala loop ye btata h ki kitni baar kya chhej print hogi
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zot(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butri(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void srh(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void dp(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Here is the pattern of Stairs star:");
        stair_star(10);
        System.out.println("Here is the pattern of Opposite Stairs star:");
        stair_star_opp(10);
        System.out.println("Here is the pattern of Opposte Stairs star :");
        stair_star_opp2(10);
        System.out.println("Here is the pattern of Stairs number:");
        num_stairs(10);
        System.out.println("Here is the pattern of Opposite Stairs number:");
        num_strair_opp(5);
        System.out.println("Here is the pattern of Stairs number :");
        num_stairs2(10);
        System.out.println("Here is the pattern of Stairs alphabet:");
        alphabet_pattern(10);
        System.out.println("Here is the pattern of Square:");
        square(10);
        System.out.println("Here is the pattern of Hollow rectangle:");
        holorect(10, 10);
        System.out.println("Here is the pattern of Hollow rhombus:");
        hrh(10);
        System.out.println("Here is the pattern of Stairs star:");
        hlfpyr(10, 10);
        System.out.println("Here is the pattern of Floyd's Triangle:");
        f_tri(10, 1);
        System.out.println("Here is the pattern of 0-1:");
        zot(10);
        System.out.println("Here is the pattern of Butterfly:");
        butri(10);
        System.out.println("Here is the pattern of Solid rhombus:");
        srh(10);
        System.out.println("Here is the pattern of Diamond:");
        dp(10);
    }
}
