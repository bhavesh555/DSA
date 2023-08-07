package binarysearch;
import java.util.*;
public class SearchInARotatedSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int pivot = helper(n, arr);

        int ans1 = binarySearch(arr, 0, pivot-1, k);
        int ans2 = binarySearch(arr, pivot, n-1, k);

        if(ans1 == -1 && ans2 == -1){
            System.out.println("Not Found");
        }
        else if(ans1 == -1){
            System.out.println(ans2);
        }
        else{
            System.out.println(ans1);
        }
    }

    public static int helper(int n , int[] arr){
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid+1;
            }
            else if(mid > start && arr[mid] < arr[mid-1]){
                return mid;
            }
            else if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int start, int end, int k){
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] > k){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
