package conditional;

import java.util.*;

public class incomeTaxCal {
    public static void main(String[] args) {
        // in single line, {} in if else block not mandatory but recommended
        // CHECK IF A NUMBER IS EVEN OR ODD?
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax; // java automatically adds 0 for int , 0.00 for float, '' for char
        if (income < 5e5) {
            tax = 0;
        } else if (income < 10e5) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Tax: " + tax);
    }
}
