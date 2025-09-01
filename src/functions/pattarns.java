package functions;

import java.util.*;

public class pattarns {

    public static void HollowPattarn(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void InvertedAndRotatedHalfPyramid(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void InvertedAndHalfPyramidWithNumbers(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int rows) {
        int printNum = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(printNum + " ");
                printNum++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void ButterFly(int Hrows) {
        for (int i = 0; i < Hrows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < (Hrows - i - 1) * 2; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = Hrows - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < (Hrows - i - 1) * 2; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        // for (int i = Hrows; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("* ");
        // }
        // for (int j = 0; j < (Hrows - i) * 2; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 0; j < i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

    }

    public static void solidRhombus(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < rows; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == rows - 1) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void dimond(int hr) {
        for (int i = 1; i <= hr; i++) {
            for (int j = 0; j < hr - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = hr; i > 0; i--) {
            for (int j = 0; j < hr - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // HollowPattarn(5, 10);
        // InvertedAndRotatedHalfPyramid(10);
        // hollowRhombus(5);
        dimond(10);

    }
}
