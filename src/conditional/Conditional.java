package conditional;

import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        // in single line, {} in if else block not mandatory but recommended
        // CHECK IF A NUMBER IS EVEN OR ODD?
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
