package binarysearch;

import java.util.*;

public class SearchInAInfiniteSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc. nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int ans = helper(arr, target);

        System.out.println(ans);
    }

    public static int helper(int[] arr, int target){
        int low = 0;
        int high = 1;

        while(arr[high] < target){
            low = high;
            high = 2 * high;
        }

        return binarySearch(arr, target, low, high);
    }

    public static int binarySearch(int[] arr, int target, int low, int high){
        int mid = 0;

        while(low <= high){
            mid = low + (high - low)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return -1;
    }
}
