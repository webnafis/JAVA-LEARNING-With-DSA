package conditional;

import java.util.*;

public class Q2Q5 {

    public static void main(String[] args) {
        double temp = 103.5;
        if (temp > 100) {
            System.out.println("Have fever!!!");
        } else {
            System.out.println("Don't have fever!!!");
        }

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year!!!");
                } else {
                    System.out.println("Not leap year!!!");
                }
            } else {
                System.out.println("Leap year!!!");
            }
        } else {
            System.out.println("Not leap year!!!");
        }
    }

}