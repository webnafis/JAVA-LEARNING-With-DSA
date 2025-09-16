package arrays;

import java.lang.reflect.Array;
import java.util.*;

public class sorting {
    // public static void printArr(Integer inputArr[]) { // for collection reverse
    // order
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

    public static void bubbleSortSmallToLarge(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("bubble sort done.");
                return;
            }

        }
        System.out.println("bubble sort done.");
    }

    public static void bubbleSortLargeToSmall(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("bubble sort done.");
                return;
            }

        }
        System.out.println("bubble sort done.");
    }

    public static void selectionSortSmallToLarge(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            arr[i] += arr[smallest];
            arr[smallest] = arr[i] - arr[smallest];
            arr[i] = arr[i] - arr[smallest];

        }
    }

    public static void selectionSortLargeToSmall(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int largest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[largest] < arr[j]) {
                    largest = j;
                }
            }
            // generates error with variable less swap here
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

        }
    }

    public static void insertionSortSmallToLarge(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && curr < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void insertionSortLargeToSmall(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && curr > arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void countingSortSmallToLarge(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // if (max < arr[i]) {
            // max = arr[i];
            // }
            max = Math.max(max, arr[i]);
        }

        int arrNew[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[arr[i]]++;
        }
        int index = 0;
        for (int i = 0; i < arrNew.length; i++) {
            while (arrNew[i] > 0) {
                arr[index] = i;
                index++;
                arrNew[i]--;
            }
        }
    }

    public static void countingSortLargeToSmall(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int arrNew[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[arr[i]]++;
        }
        int index = 0;
        for (int i = arrNew.length - 1; i >= 0; i--) {
            while (arrNew[i] != 0) {
                arr[index] = i;
                index++;
                arrNew[i]--;
            }
        }
    }

    public static void main(String args[]) {
        // Integer arr[] = { 5, 4, 1, 3, 2 }; // for collection reverse order
        // Arrays.sort(arr, 1, 4, Collections.reverseOrder());// { 5 , 1 , 3 , 4 , 2 }
        // // 4 theke 3 ponto sort hoise main arr er
        // Arrays.sort(arr, Collections.reverseOrder());
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        // Arrays.sort(arr);
        countingSortSmallToLarge(arr); // you can try for negative numbers mixed , idea is in the video, not used
                                       // actually for negative
        printArr(arr);

    }
}
