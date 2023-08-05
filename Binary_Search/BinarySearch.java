package Binary_Search;

import java.util.*;
public class BinarySearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("n : ");
        int n = sc.nextInt();
        System.out.println("arr[] : ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println("target : ");
        int target = sc.nextInt();

        int ans = helper(n, arr, target);
        System.out.println("ans : " + ans);
    }

    public static int helper(int n, int[] arr, int target){
        int start = 0;
        int end = n-1;
        int mid = 0;

        while(start <= end){
            mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }
}