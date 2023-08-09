package binarysearch;

import java.util.*;

public class IndexOf1InABinarySortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc. nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = helper(arr);

        System.out.println(ans);
    }

    public static int helper(int[] arr){
        int low = 0;
        int high = 1;

        while(arr[high] == 0){
            low = high;
            high = 2 * high;
        }

        return binarySearch(arr, low, high);
    }

    public static int binarySearch(int[] arr, int low, int high){
        int mid = 0;

        while(low <= high){
            mid = low + (high - low)/2;

            if(arr[mid] == 1 && (mid == 0 || arr[mid-1] == 0)){
                return mid;
            }
            else if(arr[mid] == 1){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return -1;
    }
}
