package conditional;

import java.util.*;

public class ternaryOperator {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int marks = sc1.nextInt();
        String result = (marks > 32) ? "PASS" : "FAIL";
        System.out.println(result);

        Scanner sc2 = new Scanner(System.in);
        int number = sc2.nextInt();
        String type = (number % 2 == 0) ? "even" : "odd";
        System.out.println(type);
    }

}
