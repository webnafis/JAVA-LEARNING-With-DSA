import java.util.*;

class Basic{

    public static void printNumbersDecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + ", ");
        printNumbersDecreasing(n-1);
    }

    public static void printNumbersIncreasing(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        printNumbersIncreasing(n-1);
        System.out.print( ", " +n );
    }

    public static long printFact(int n){
        if(n== 0){
            return 1;
        }
        return n * printFact(n-1);
    }

    public static int sumNatural(int n){
        if(n==1)return 1;
        return n+ sumNatural(n-1);
    }

    public static int fibonacci(int n){
        if(n==0 || n==1 ) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOcc(int arr[], int key, int i){
        if(arr.length == i) return -1;
        if(arr[i] == key) return i;
        return firstOcc(arr, key, i+1);
    }

    public static int LastOcc(int arr[], int key, int i){
        if(arr.length == i) return -1;

        int res = LastOcc(arr, key, i+1);
        if(res == -1 && arr[i] == key)return i;
        return res;
    }

    public static int powxn(int x, int n){
        if(n==1)return x;
        return x * powxn(x, n-1);
    }
    public static int powxnOpt(int x, int n){
        if(n==1)return x;
        int res = powxnOpt(x, n/2);
        if(n%2==0){
            return res* res;
        }else{
            return x * res * res;
        }
    }
    public static int tiling(int n){
        if(n==0 || n==1){

            return 1;
        }
        return tiling(n-1) + tiling(n-2);

    }

    public static void printStr(String existingString, StringBuilder newString, int i, boolean map[] ){
        if(existingString.length() ==i){
            System.out.println(newString);
            return;
        }
        char curr = existingString.charAt(i);
        if(map[curr-'a'] == true){
            printStr(existingString, newString, i+1, map);
        }else{
            map[curr-'a'] = true;
            printStr(existingString, newString.append(curr), i+1, map);
        }
    }

    public static int friendsPairing(int n){
        if(n== 1 || n==2){
            return n;
        }
        return 1*friendsPairing(n-1)+ (n-1)*friendsPairing(n-2); // 1* for understanding combination
    }

    public static void binaryString(int n, String newStr, char lCase){
        if(n==0){
            System.out.println(newStr);
            return;
        }
        
        binaryString(n-1, newStr+'0', '0');
        if(lCase == '0'){
            binaryString(n-1, newStr+'1', '1');
        }

    }
    public static void main(String args[]){
        // printNumbersDecreasing(10);
        // printNumbersIncreasing(10);
        // System.out.println(printFact(5));
        // System.out.println(fibonacci(25));
        int array[] = {1, 7, 2, 3, 4, 0, 5, 5,38, 0, 7 ,8};
        // System.out.println(friendsPairing(3));
        binaryString(3, "", '0');
        // printStr("appnnacollege", new StringBuilder(""), 0, new boolean[26]);

    }
}