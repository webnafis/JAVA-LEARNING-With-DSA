package arrays;

import java.util.*;

public class basic {
    public static void update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    public static int findIndex(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int findLargestSmallestLinear(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int findIndexBinary(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            }
            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void printArr(int inputArr[]) {
        System.out.print("{ ");
        for (int i = 0; i < inputArr.length; i++) {
            if (i == inputArr.length - 1) {
                System.out.println(inputArr[i] + " }");
            } else {
                System.out.print(inputArr[i] + " , ");
            }
        }
    }

    public static void reverseArray(int arr[]) {

        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            arr[start] += arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            System.out.println(start);
        }
        return;
    }

    public static void pairsArr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
            // found out the pairs number
        }
    }

    public static void printSubarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("{" + arr[i]);
                for (int k = i + 1; k <= j; k++) {
                    System.out.print("," + arr[k]);
                }
                System.out.print("}");

            }
            System.out.println();
        }
    }

    public static int maxSubarrSumBF(int arr[]) {
        int maxSubarrSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSubarrSum = arr[i];
                for (int k = i + 1; k <= j; k++) {
                    currSubarrSum += arr[k];
                }
                if (maxSubarrSum < currSubarrSum) {
                    maxSubarrSum = currSubarrSum;
                }
            }
        }
        return maxSubarrSum;
    }

    public static int minSubarrSumBF(int arr[]) {
        int minSubarrSum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSubarrSum = arr[i];
                for (int k = i + 1; k <= j; k++) {
                    currSubarrSum += arr[k];
                }
                if (minSubarrSum > currSubarrSum) {
                    minSubarrSum = currSubarrSum;
                }
            }
        }
        return minSubarrSum;
    }

    // prefix sum is pending
    public static void main(String[] args) {
        // int intArr[] = new int[4];
        // int intArray[] = { 3, 5, 6, 78, };
        // String arr[] = { "nafis", "kamal" };
        // int inputArr[] = new int[10];
        int inputArr[] = { 1, -2, 6, -1, 3 };
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < inputArr.length; i++) {
        // inputArr[i] = sc.nextInt();
        // }
        // inputArr[5] = 55;
        // update(inputArr);
        // System.out.print("{ ");
        // for (int i = 0; i < inputArr.length; i++) {
        // if (i == inputArr.length - 1) {
        // System.out.println(inputArr[i] + " }");
        // } else {
        // System.out.print(inputArr[i] + " , ");
        // }
        // }
        // System.out.println(inputArr.length);
        // if (findIndex(inputArr, 11) == -1) {
        // System.out.println("NOT FOUND");
        // } else {
        // System.out.println(findIndex(inputArr, 11));
        // }
        // printArr(inputArr);
        // reverseArray(inputArr);
        // printArr(inputArr);
        // printSubarr(inputArr);

        System.out.println(minSubarrSumBF(inputArr));
    }
}
