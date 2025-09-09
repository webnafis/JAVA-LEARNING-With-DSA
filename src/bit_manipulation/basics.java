package bit_manipulation;

import java.util.*;

public class basics {

    public static void oddOrEven(int a) {
        if ((a & 1) == 0) {
            System.err.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    public static int getIthBit(int n, int i) {
        if ((n & (1 << i)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {

        return (n | (1 << i));

    }

    public static int clearIthBit(int n, int i) {

        return (n & (~(1 << i)));

    }

    public static int updateIthBit(int n, int i, int setbit) {
        // if (setbit == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }

        return clearIthBit(n, i) | (setbit << i);

    }

    public static int clearLastIBits(int n, int i) {
        return n & ((~0) << i);
    }

    public static int clearRangeOfBits(int n, int i, int j) {
        // return n & (~((~((~0) << (i - j + 1))) << j));
        // myapproach

        // apnacollege
        int a = (~0) << (i + 1);
        int b = (1 << j) - 1;
        return (n & (a | b));

    }

    public static boolean powerOfTwo(int n) {
        // if ((n & (n - 1)) == 0) {
        // System.out.println("YES");
        // } else {
        // System.out.println("NO");
        // }
        return ((n & (n - 1)) == 0);
    }

    public static int countSetBits(int a) {
        int c = 0;
        while (a > 0) {

            if ((a & 1) != 0) {
                c++;
            }
            a = a >> 1;
        }
        return c;
    }

    public static long fastExponentiation(int n, int e) {
        // to understand see class slide again, i understood first time
        // get bits seperatedly from power
        // single bit * n to the power 2 to the power i
        // n to the power 2 to the power i er bodole amra every time n square korchi
        // except first time
        // subidha => age loop power-1 porjonto cholto ekhon power e jotogula bit ache
        // totobar cholbe
        long ans = 1;
        while (e > 0) {

            if ((e & 1) != 0) {
                ans = ans * n;
            }
            n = n * n;
            e = e >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println(3 << 5);
        // System.out.println((8 >> 3));

        // oddOrEven(11);
        // oddOrEven(14);
        System.out.println(fastExponentiation(5, 3));
    }

}
