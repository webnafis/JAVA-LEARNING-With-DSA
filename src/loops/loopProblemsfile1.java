package loops;

import java.util.*;

public class loopProblemsfile1 {
    public static void main(String arg[]) {
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // while (number > 0) {
        // System.out.print(number % 10);
        // number /= 10;
        // }

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rn = 0;
        while (number > 0) {
            rn = rn * 10 + (number % 10);
            number /= 10;
        }
        System.out.println(rn);
    }
}
