package functions;

import java.util.*;

public class functionsBasics {
    public static void printSalam() {
        System.out.println("Assalamu Alaikum");
        System.out.println("Assalamu Alaikum");
        System.out.println("Assalamu Alaikum");
        return;
    }

    public static int calculateSum(int a, int b) {// parameters
        return a + b;
    }

    public static int calculateSum(int a, int b, int c) {// parameters
        return a + b + c;
    }

    public static float calculateSum(float a, float b) {// parameters
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int BiCoeff(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        // printSalam();

        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt(), num2 = sc.nextInt();
        // System.out.println(calculateSum(4.2f, 4.5f));// arguments
        // System.out.println(BiCoeff(5, 2));
        System.out.println(isPrime(71));

    }
}
