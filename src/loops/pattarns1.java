package loops;

import java.util.*;

public class pattarns1 {
    public static void main(String arg[]) {
        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // int n = 4;
        // for (int i = 0; i < n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        int n = 4;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
