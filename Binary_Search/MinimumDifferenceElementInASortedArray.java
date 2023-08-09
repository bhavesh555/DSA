package binarysearch;

import java.util.*;

public class MinimumDifferenceElementInASortedArray {
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
        int high = arr.length - 1;
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

        if(Math.abs(arr[low] - target) < Math.abs(arr[high] - target)){
            return low;
        }
        else{
            return high;
        }
    }
}
