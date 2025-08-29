package conditional;

import java.util.*;

public class largest_of_3 {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        if (a >= b && a >= c) {
            System.out.println("a is largest.");
        } else if (b >= c) {
            System.out.println("b is largest.");
        } else {
            System.out.println("c is largest.");
        }
    }

}
