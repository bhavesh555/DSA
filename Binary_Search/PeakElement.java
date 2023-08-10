package binarysearch;

import java.util.*;

public class PeakElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = helper(arr);

        System.out.println(ans);
    }

    public static int helper(int[] arr){
        int ans = -1;
        int n = arr.length;
        int l = 0;
        int r = n-1;
        int m = 0;


        while(l <= r){
            m = l + (r - l)/2;

            if(m > 0 && m < n-1){
                if(arr[m] > arr[m-1] && arr[m] > arr[m+1]){
                    ans = m;
                    break;
                }
                else if(arr[m-1] > arr[m]){
                    r = m - 1;
                }
                else{
                    l = m + 1;
                }
            }
            else if(m == 0){
                if(arr[m] > arr[m+1]){
                    ans = m;
                    break;
                }
                else{
                    l = m + 1;
                }
            }
            else if(m == n-1){
                if(arr[m] > arr[m-1]){
                    ans = m;
                    break;
                }
                else{
                    r = m - 1;
                }
            }
        }
        return ans;
    }
}
