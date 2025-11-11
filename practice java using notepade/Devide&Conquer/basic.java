import java.util.*;

class Basic{

    public static void margeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si+(ei - si) / 2;
        margeSort(arr, si, mid);
        margeSort(arr, mid+1, ei);
        margeArr(arr, si, ei, mid);
    }
 
    public static void margeArr(int arr[], int si, int ei, int mid){
        int narr[] = new int[ei-si+1];
        int i= si;
        int j= mid+1;
        int idx = 0;
        while(i<=mid && j<= ei){
            if(arr[i]> arr[j]){
                narr[idx] = arr[j];
                j++;
            }else{
                narr[idx] = arr[i];
                i++;
            }


            idx++;
        }
        while(i<=mid){
            narr[idx] = arr[i];
            i++;
            idx++;
        }
                
        while(j<=ei){
            narr[idx] = arr[j];
            j++;
            idx++;
        }
        for( i= si, idx=0; idx< narr.length; i++, idx++){
            arr[i] = narr[idx];
        }
    }

    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int s = si;
        for(int i = si; i< ei; i++){
            if(arr[i]<= pivot){
                int temp = arr[s];
                arr[s]= arr[i];
                arr[i] = temp;
                s++;
            }
        }
        int temp = arr[s];
        arr[s]= pivot;
        arr[ei] = temp;
        return s;
    }

    public static int searchRotatedSorted(int arr[], int tar, int si, int ei){
        int mid = si + (ei-si)/2;
        if(si>ei)return -1;
        if(arr[mid] == tar){
            return mid;
        }
        if(arr[si]<= arr[mid]){
            if(arr[si]<= tar && arr[mid]>= tar){
                ei = mid-1;
            }else{
                si = mid + 1;
            }
        }else{
            if(arr[mid]<= tar && arr[ei]>= tar){
                si = mid+1;
            }else{
                ei = mid - 1;
            }
        }

        return searchRotatedSorted(arr, tar, si, ei);
        
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2, 3};
        // margeSort(arr, 0, arr.length-1);

            System.out.print( searchRotatedSorted(arr, 4,0, arr.length-1));

    }
}