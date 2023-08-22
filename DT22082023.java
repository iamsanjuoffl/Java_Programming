/*
 * input = 3;
 * Pattern
 * ##+##
 * #+-+#
 * +-+-+
 * #+-+#
 * ##+##
 */
package Java_Programming;
import java.util.*;
public class DT22082023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print("#");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("-*");
                }
            }
            for (int j = i; j < n - 1; j++) {
                System.out.print("#");
            }
            System.out.println();

        }
        for (int j = 0; j < n; j++) {
            if (j == 0) {
                System.out.print("*");
            } else {
                System.out.print("-*");
            }
        }
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            for (int j = i; j < n - 1; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print("-*");
                }
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
