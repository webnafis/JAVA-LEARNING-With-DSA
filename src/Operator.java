import java.util.*;

public class Operator {
    public static void main(String[] args) {
        int A = 10;
        int B = 3;
        int c = A--;
        System.out.println("c = " + c + " and A = " + A);
        System.out.println("add = " + (A + B));
        System.out.println("subtract = " + (A - B));
        System.out.println("multiply = " + (A * B));
        System.out.println("devide = " + (A / B));
        System.out.println("modulo = " + (A % B));
        c = ++A;
        System.out.println("c = " + c + " and A = " + A);
        System.out.println("==, !=, >,<,>=,<= and &&, ||, !");
        System.out.println((A == B));
        System.out.println((A == c));
        A -= B; // faster more: +=, -=, /=, *=
        // A = A-B; // slower
        System.out.println(A);

    }
}
